package helpDesck.Enuns;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum Status {
   ABERTO(0, "ABERTO"),ANDAMENTO(1, "ANDAMENTO"),ENCERRADO(2, "ENCERRADO") ;

   private Integer codigo;
   private String descricao;


   public  static Status toEnum (Integer codigo){
       if (codigo == null){
           return null;
       }

       for (Status x : Status.values()){
           if (codigo.equals(x.getCodigo())){
               return x ;
           }
       }
       throw  new IllegalArgumentException("Status inválido");
   }
}
