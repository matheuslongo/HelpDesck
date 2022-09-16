package helpDesck.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "chamado")
public class Chamado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Integer id ;

    @Column(name = "dataAbertura")
    Date dataAbertura ;

    @Column( name = "dataFechamento")
    Date dataFechamento ;

    @Column(name = "titulo", nullable = false)
    String titulo ;

    @Column(name = "observacoes")
    String obeservacoes ;

}
