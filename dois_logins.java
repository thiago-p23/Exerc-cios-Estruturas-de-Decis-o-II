void main() {

    Scanner scanner = new Scanner(System.in);

    // Entrada de dados
    System.out.print("Digite o usuário: ");
    String usuario = scanner.nextLine();

    System.out.print("Digite a senha: ");
    String senha = scanner.nextLine();

    // Logins válidos
    String usuario1 = "atila";
    String senha1 = "12345";

    String usuario2 = "olivi";
    String senha2 = "54321";

    // Validação
    if ((usuario.equals(usuario1) && senha.equals(senha1)) ||
            (usuario.equals(usuario2) && senha.equals(senha2))) {
        System.out.println("Seja bem vindo!");
    } else {
        System.out.println("Usuário e senha não conferem");
    }
}