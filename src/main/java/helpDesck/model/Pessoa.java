package helpDesck.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column( name = "nome", nullable = false)
    String nome ;

    @Column(name = "cpf", unique = true, nullable = false)
    String cpf ;

    @Column(name = "email", nullable = false)
    String email ;

    @Column(name = "senha", nullable = false)
    String senha ;

    @Column(name = "dataCriacao", nullable = false)
    Date dataCriacao;





}
