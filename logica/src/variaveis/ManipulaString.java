package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
		
		String email = "RafaEl.RsAlgmail.com";
		
		System.out.println("Original: "+ email);
		System.out.println("Minuscula: " + email.toLowerCase());
		System.out.println("Maicusula: " + email.toUpperCase());
		System.out.println("Tem arroba? " + email.contains("@"));
		System.out.println("Posição do @: " + email.indexOf("@"));
		System.out.println("Qtde de Caracteres? " + email.length());
		System.out.println("Do 2º até io quinto caracter: " + email.substring(1,5));
		System.out.println("Primeira metade: " + email.substring(0,(email.length()/2)));
		System.out.println("Usuário: " + email.substring(0,(email.indexOf("@"))).toUpperCase());
		System.out.println("Dominio: " + email.substring((email.indexOf("@")+1),email.length()).toLowerCase());
		System.out.println("Primeiro caracter: " + email.charAt(0));
		
	}
}
