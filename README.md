🔐 Sistema de Login e Cadastro de Usuários

Projeto full stack desenvolvido com foco em autenticação de usuários, utilizando Spring Boot no backend e HTML/CSS no frontend, com persistência de dados em MySQL.

📌 Sobre o Projeto

Este projeto implementa um sistema completo de login e cadastro de usuários, permitindo:

Registro de novos usuários
Autenticação (login)
Validação de dados
Persistência em banco de dados

Ideal para estudos de integração entre frontend e backend usando Java.

🚀 Tecnologias Utilizadas
🔧 Backend
Java
Spring Boot
Spring Data JPA
Hibernate
🎨 Frontend
HTML5
CSS3
🗄️ Banco de Dados
MySQL
📁 Estrutura do Projeto
loginProject/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/seuusuario/loginProject/
│   │   │       ├── controller/
│   │   │       ├── model/
│   │   │       ├── repository/
│   │   │       └── service/
│   │   │
│   │   └── resources/
│   │       ├── templates/
│   │       ├── static/
│   │       └── application.properties
│
└── pom.xml
⚙️ Funcionalidades
✅ Cadastro de usuário
✅ Login com validação
✅ Integração com banco de dados
✅ Organização em camadas (Controller, Service, Repository)
🛠️ Como Executar o Projeto
1. Clone o repositório
git clone https://github.com/EmanoelCariolando/loginProject.git
2. Configure o banco de dados

Crie um banco no MySQL:

CREATE DATABASE login_db;

Configure o arquivo application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/login_db
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
3. Execute o projeto

Você pode rodar pela IDE (IntelliJ ou VS Code) ou pelo terminal:

./mvnw spring-boot:run
4. Acesse no navegador
http://localhost:8080
🧠 Aprendizados

Durante o desenvolvimento deste projeto, foram aplicados conceitos como:

Arquitetura MVC
Integração entre frontend e backend
Persistência com JPA/Hibernate
Criação de APIs REST
Validação de dados
📸 Preview

(Adicione aqui prints do sistema se quiser valorizar mais o repositório)

📌 Melhorias Futuras
🔒 Criptografia de senha (Spring Security / BCrypt)
👤 Sistema de sessões/autenticação avançada
📱 Responsividade no frontend
🌐 Deploy em nuvem
🤝 Contribuição

Sinta-se à vontade para contribuir com melhorias!

Fork o projeto
Crie uma branch (git checkout -b feature/minha-feature)
Commit suas mudanças
Push para a branch
Abra um Pull Request
📄 Licença

Este projeto é apenas para fins educacionais.
