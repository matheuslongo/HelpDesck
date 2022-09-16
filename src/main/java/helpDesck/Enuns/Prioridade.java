package helpDesck.Enuns;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum Prioridade {
   BAIXA(0, "BAIXA"),MEDIA(1, "MEDIA"),ALTA(2, "ALTA") ;

   private Integer codigo;
   private String descricao;


   public  static Prioridade toEnum (Integer codigo){
       if (codigo == null){
           return null;
       }

       for (Prioridade x : Prioridade.values()){
           if (codigo.equals(x.getCodigo())){
               return x ;
           }
       }
       throw  new IllegalArgumentException("Status inválido");
   }
}
