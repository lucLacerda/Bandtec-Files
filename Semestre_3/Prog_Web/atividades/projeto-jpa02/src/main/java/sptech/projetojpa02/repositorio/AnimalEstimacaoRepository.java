package sptech.projetojpa02.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;
import sptech.projetojpa02.dominio.AnimalEstimacao;

import java.util.List;

public interface AnimalEstimacaoRepository
                        extends JpaRepository<AnimalEstimacao, Long> {
/*
Aqui usamos os Dynamic Finders
 */
    List<AnimalEstimacao> findByCpfDono(String cpf);

    List<AnimalEstimacao> findByCpfDonoContains(String cpf);

    List<AnimalEstimacao> findByCpfDonoAndEmailDono(
                                String cpf, String email);

    List<AnimalEstimacao> findByCpfDonoOrEmailDono(
                                String cpf, String email);

    List<AnimalEstimacao> findByCpfDonoContainsAndEmailDonoContains(
                                String cpf, String email);

    // todos com 'cadastrado' == true
    List<AnimalEstimacao> findByCastradoTrue();

    // todos com 'cadastrado' == false
    List<AnimalEstimacao> findByCastradoFalse();

    // ex de consulta que só traria 1
    // AnimalEstimacao findByCpfDono(String cpf);
    // Optional<AnimalEstimacao> findByCpfDono(String cpf);

    // consulta de contagem
    Integer countByCastradoFalse();

    Integer countByCastrado(boolean castrado);

    // exclusão com dynamic finders
    // devemos usar as anotações @Transactional e @Modifying
    @Transactional // do pacote org.springframework....
    @Modifying
    Integer deleteByCastradoFalse();

    @Transactional
    @Modifying
    Integer deleteByCastrado(boolean castrado);
    // void deleteByCastradoFalse(); // neste caso não retorna a quantidade de excluídos


}
