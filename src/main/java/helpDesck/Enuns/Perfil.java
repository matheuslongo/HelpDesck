package helpDesck.Enuns;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum Perfil {
   ADMIN(0, "ROLE_ADMIN"),CLIENTE(1, "ROLE_CLIENTE"),TECNICO(2, "ROLE_TECNICO") ;

   private Integer codigo;
   private String descricao;


   public  static Perfil toEnum (Integer codigo){
       if (codigo == null){
           return null;
       }

       for (Perfil x : Perfil.values()){
           if (codigo.equals(x.getCodigo())){
               return x ;
           }
       }
       throw  new IllegalArgumentException("Perfil inválido");
   }
}
