public class Usuario {
        - String nombre;
        - String email;
        - String password;
    
        public Usuario(String nombre, String email, String password) {
            this.nombre = nombre;
            this.email = email;
            this.password = password;
        }
        public boolean autenticar(String email, String password) {
            return this.email.equals(email) && this.password.equals(password);
        }
        public boolean validarEmail() {
            return email != null && email.contains("@");
        }
        public class Usuario {
            - String nombre;
            - String email;
            - String password;
            public Usuario(String nombre, String email, String password) {
                this.nombre = nombre;
                this.email = email;
                this.password = password;
            }
            public class AuthService {
                public boolean autenticar(Usuario usuario, String email, String password);
            }
        }
    }