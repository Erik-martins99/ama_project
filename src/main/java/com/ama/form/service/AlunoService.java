package com.ama.form.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ama.form.dto.Aluno.CreateAlunoDTO;
import com.ama.form.dto.Educacao.CreateEducacaoDTO;
import com.ama.form.dto.Endereco.CreateEnderecoDTO;
import com.ama.form.dto.Saude.CreateSaudeDTO;
import com.ama.form.dto.SituacaoHabitacional.CreateSituacaoHabitacionalDTO;
import com.ama.form.model.Aluno;
import com.ama.form.model.Educacao;
import com.ama.form.model.Endereco;
import com.ama.form.model.PessoaAutorizada;
import com.ama.form.model.ProfissionalAtendimento;
import com.ama.form.model.Responsavel;
import com.ama.form.model.Saude;
import com.ama.form.model.SituacaoHabitacional;
import com.ama.form.repository.AlunoRepository;

import jakarta.transaction.Transactional;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository alunoRepository;

    @Transactional
    public Aluno criarAluno(CreateAlunoDTO dto) {

        Aluno aluno = new Aluno();

        aluno.setNome(dto.nome());
        aluno.setSexo(dto.sexo());
        aluno.setTipoDeficiencia(dto.tipoDeficiencia());
        aluno.setSindrome(dto.sindrome());
        aluno.setDataNascimento(dto.dataNascimento());
        aluno.setNacionalidade(dto.nacionalidade());
        aluno.setNaturalidade(dto.naturalidade());
        aluno.setRg(dto.rg());
        aluno.setCpf(dto.cpf());
        aluno.setCartaoSUS(dto.cartaoSUS());
        aluno.setPlanoSaude(dto.planoSaude());
        aluno.setCiptea(dto.ciptea());
        aluno.setAnoIngresso(dto.anoIngresso());
        aluno.setFormaIngresso(dto.formaIngresso());
        aluno.setMeioTransporte(dto.meioTransporte());

        // Endereço create ou save
        if (dto.endereco() != null) {
            CreateEnderecoDTO e = dto.endereco();
            Endereco endereco = new Endereco();

            endereco.setLogradouro(e.logradouro());
            endereco.setBairro(e.bairro());
            endereco.setCep(e.cep());
            endereco.setReferencia(e.referencia());
            endereco.setCaracteristicas(e.caracteristicas());
            endereco.setSituacao(e.situacao());
            endereco.setTipoConstrucao(e.tipoConstrucao());
            endereco.setTipoImovel(e.tipoImovel());
            endereco.setAbastecimentoAgua(e.abastecimentoAgua());
            endereco.setIluminacao(e.iluminacao());
            endereco.setSaneamento(e.saneamento());
            endereco.setBanheiro(e.banheiro());
            endereco.setDestinoLixo(e.destinoLixo());

            aluno.setEndereco(endereco);
        }

        //Situação habitaciona create ou save
        if (dto.situacaoHabitacional() != null) {
            CreateSituacaoHabitacionalDTO s = dto.situacaoHabitacional();
            SituacaoHabitacional sit = new SituacaoHabitacional();

            sit.setNumeroComodos(s.numeroComodos());
            sit.setPossuiPasseLivre(s.possuiPasseLivre());
            sit.setCartaoEstacionamentoDeficiente(s.cartaoEstacionamentoDeficiente());
            sit.setBensPossuidos(s.bensPossuidos());
            sit.setProfissionalDomestico(s.profissionalDomestico());
            sit.setRendaFamiliar(s.rendaFamiliar());
            sit.setBeneficiosSociais(s.beneficiosSociais());
            sit.setPessoasRecebemBpc(s.pessoasRecebemBpc());

            aluno.setSituacaoHabitacional(sit);
        }

        //Saude create ou save
        if (dto.saude() != null) {
            CreateSaudeDTO s = dto.saude();
            Saude saude = new Saude();

            saude.setUsoMedicamentos(s.usoMedicamentos());
            saude.setGastosMedicamentos(s.gastosMedicamentos());
            saude.setValorMedioGastos(s.valorMedioGastos());
            saude.setAlergiaMedicamentos(s.alergiaMedicamentos());
            saude.setAlergiaInsetos(s.alergiaInsetos());
            saude.setAlergiaProdutosLimpeza(s.alergiaProdutosLimpeza());
            saude.setHistoricoClinico(s.historicoClinico());
            saude.setTipoParto(s.tipoParto());
            saude.setDiagnosticos(s.diagnosticos());
            saude.setProfissionaisAtuantes(s.profissionaisAtuantes());
            saude.setFrequentaInstituicao(s.frequentaInstituicao());
            saude.setTerapias(s.terapias());
            saude.setMedicoEspecialista(s.medicoEspecialista());
            saude.setPossuiPessoaComDeficiencia(s.possuiPessoaComDeficiencia());
            saude.setDeficienciaFamiliar(s.deficienciaFamiliar());

            aluno.setSaude(saude);
        }

        // Educacao create ou save
        if (dto.educacao() != null) {
            CreateEducacaoDTO e = dto.educacao();
            Educacao educ = new Educacao();

            educ.setTipoEscola(e.tipoEscola());
            educ.setNomeEscola(e.nomeEscola());
            educ.setTurno(e.turno());
            educ.setMatricula(e.matricula());
            educ.setPossuiPAE(e.possuiPAE());
            educ.setEscolaridadeMae(e.escolaridadeMae());

            aluno.setEducacao(educ);
        }

        // Responsavel create ou save
        if (dto.responsaveis() != null) {
            aluno.setResponsaveis(
                    dto.responsaveis().stream().map(r -> {
                        Responsavel resp = new Responsavel();

                        resp.setNome(r.nome());
                        resp.setParentesco(r.parentesco());
                        resp.setTelefone1(r.telefone1());
                        resp.setTelefone2(r.telefone2());
                        resp.setEmail(r.email());
                        resp.setRendaFamiliar(r.rendaFamiliar());
                        resp.setBeneficiosSociais(r.beneficiosSociais());
                        resp.setPessoasRecebemBpc(r.pessoasRecebemBpc());
                        resp.setConvivenciaFamiliar(r.convivenciaFamiliar());

                        resp.setAluno(aluno);

                        return resp;
                    }).collect(Collectors.toList())
            );
        }

        //Pessoa autorizada create ou save
        if (dto.pessoasAutorizadas() != null) {
            aluno.setPessoasAutorizadas(
                    dto.pessoasAutorizadas().stream().map(p -> {
                        PessoaAutorizada pa = new PessoaAutorizada();

                        pa.setNome(p.nome());
                        pa.setCpf(p.cpf());
                        pa.setTelefone(p.telefone());
                        pa.setAluno(aluno);

                        return pa;
                    }).collect(Collectors.toList())
            );
        }

        //Profissional create ou save
        if (dto.profissionais() != null) {
            aluno.setProfissionais(
                    dto.profissionais().stream().map(p -> {
                        ProfissionalAtendimento prof = new ProfissionalAtendimento();

                        prof.setEspecialidade(p.especialidade());
                        prof.setNomeProfissional(p.nomeProfissional());
                        prof.setAluno(aluno);

                        return prof;
                    }).collect(Collectors.toList())
            );
        }

        //Save student
        return alunoRepository.save(aluno);
    }

    public List<Aluno> findAll() {
        return alunoRepository.findAll();
    }

    public Aluno findByIdOrThrow(Long id) {
        return alunoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado: " + id));
    }

    public java.util.Optional<Aluno> findById(Long id) {
        return alunoRepository.findById(id);
    }

    public void delete(Long id) {
        if (!alunoRepository.existsById(id)) {
            throw new RuntimeException("Aluno não existe: " + id);
        }
        alunoRepository.deleteById(id);
    }

    @Transactional
    public Aluno atualizar(Long id, CreateAlunoDTO dto) {

        Aluno aluno = findByIdOrThrow(id);

        // Atualizar dados principais
        aluno.setNome(dto.nome());
        aluno.setSexo(dto.sexo());
        aluno.setTipoDeficiencia(dto.tipoDeficiencia());
        aluno.setSindrome(dto.sindrome());
        aluno.setDataNascimento(dto.dataNascimento());
        aluno.setNacionalidade(dto.nacionalidade());
        aluno.setNaturalidade(dto.naturalidade());
        aluno.setRg(dto.rg());
        aluno.setCpf(dto.cpf());
        aluno.setCartaoSUS(dto.cartaoSUS());
        aluno.setPlanoSaude(dto.planoSaude());
        aluno.setCiptea(dto.ciptea());
        aluno.setAnoIngresso(dto.anoIngresso());
        aluno.setFormaIngresso(dto.formaIngresso());
        aluno.setMeioTransporte(dto.meioTransporte());

        // Atualizar endereço
        if (dto.endereco() != null) {
            Endereco endereco = aluno.getEndereco();
            if (endereco == null) endereco = new Endereco();

            var e = dto.endereco();
            endereco.setLogradouro(e.logradouro());
            endereco.setBairro(e.bairro());
            endereco.setCep(e.cep());
            endereco.setReferencia(e.referencia());
            endereco.setCaracteristicas(e.caracteristicas());
            endereco.setSituacao(e.situacao());
            endereco.setTipoConstrucao(e.tipoConstrucao());
            endereco.setTipoImovel(e.tipoImovel());
            endereco.setAbastecimentoAgua(e.abastecimentoAgua());
            endereco.setIluminacao(e.iluminacao());
            endereco.setSaneamento(e.saneamento());
            endereco.setBanheiro(e.banheiro());
            endereco.setDestinoLixo(e.destinoLixo());

            aluno.setEndereco(endereco);
        }

        // Atualizar situação habitacional
        if (dto.situacaoHabitacional() != null) {
            SituacaoHabitacional sit = aluno.getSituacaoHabitacional();
            if (sit == null) sit = new SituacaoHabitacional();

            var s = dto.situacaoHabitacional();
            sit.setNumeroComodos(s.numeroComodos());
            sit.setPossuiPasseLivre(s.possuiPasseLivre());
            sit.setCartaoEstacionamentoDeficiente(s.cartaoEstacionamentoDeficiente());
            sit.setBensPossuidos(s.bensPossuidos());
            sit.setProfissionalDomestico(s.profissionalDomestico());
            sit.setRendaFamiliar(s.rendaFamiliar());
            sit.setBeneficiosSociais(s.beneficiosSociais());
            sit.setPessoasRecebemBpc(s.pessoasRecebemBpc());

            aluno.setSituacaoHabitacional(sit);
        }

        // Atualizar saúde
        if (dto.saude() != null) {
            Saude saude = aluno.getSaude();
            if (saude == null) saude = new Saude();

            var s = dto.saude();
            saude.setUsoMedicamentos(s.usoMedicamentos());
            saude.setGastosMedicamentos(s.gastosMedicamentos());
            saude.setValorMedioGastos(s.valorMedioGastos());
            saude.setAlergiaMedicamentos(s.alergiaMedicamentos());
            saude.setAlergiaInsetos(s.alergiaInsetos());
            saude.setAlergiaProdutosLimpeza(s.alergiaProdutosLimpeza());
            saude.setHistoricoClinico(s.historicoClinico());
            saude.setTipoParto(s.tipoParto());
            saude.setDiagnosticos(s.diagnosticos());
            saude.setProfissionaisAtuantes(s.profissionaisAtuantes());
            saude.setFrequentaInstituicao(s.frequentaInstituicao());
            saude.setTerapias(s.terapias());
            saude.setMedicoEspecialista(s.medicoEspecialista());
            saude.setPossuiPessoaComDeficiencia(s.possuiPessoaComDeficiencia());
            saude.setDeficienciaFamiliar(s.deficienciaFamiliar());

            aluno.setSaude(saude);
        }

        // Atualizar educação
        if (dto.educacao() != null) {
            Educacao educ = aluno.getEducacao();
            if (educ == null) educ = new Educacao();

            var e = dto.educacao();
            educ.setTipoEscola(e.tipoEscola());
            educ.setNomeEscola(e.nomeEscola());
            educ.setTurno(e.turno());
            educ.setMatricula(e.matricula());
            educ.setPossuiPAE(e.possuiPAE());
            educ.setEscolaridadeMae(e.escolaridadeMae());

            aluno.setEducacao(educ);
        }

        // Atualizar Responsáveis
        if (dto.responsaveis() != null) {
            aluno.getResponsaveis().clear();
            dto.responsaveis().forEach(r -> {
                Responsavel resp = new Responsavel();
                resp.setNome(r.nome());
                resp.setParentesco(r.parentesco());
                resp.setTelefone1(r.telefone1());
                resp.setTelefone2(r.telefone2());
                resp.setEmail(r.email());
                resp.setRendaFamiliar(r.rendaFamiliar());
                resp.setBeneficiosSociais(r.beneficiosSociais());
                resp.setPessoasRecebemBpc(r.pessoasRecebemBpc());
                resp.setConvivenciaFamiliar(r.convivenciaFamiliar());
                resp.setAluno(aluno);
                aluno.getResponsaveis().add(resp);
            });
        }

        // Atualizar pessoas autorizadas
        if (dto.pessoasAutorizadas() != null) {
            aluno.getPessoasAutorizadas().clear();
            dto.pessoasAutorizadas().forEach(p -> {
                PessoaAutorizada pa = new PessoaAutorizada();
                pa.setNome(p.nome());
                pa.setCpf(p.cpf());
                pa.setTelefone(p.telefone());
                pa.setAluno(aluno);
                aluno.getPessoasAutorizadas().add(pa);
            });
        }

        // Atualizar profissionais
        if (dto.profissionais() != null) {
            aluno.getProfissionais().clear();
            dto.profissionais().forEach(p -> {
                ProfissionalAtendimento prof = new ProfissionalAtendimento();
                prof.setEspecialidade(p.especialidade());
                prof.setNomeProfissional(p.nomeProfissional());
                prof.setAluno(aluno);
                aluno.getProfissionais().add(prof);
            });
        }

        return alunoRepository.save(aluno);
    }
}
