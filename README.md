# EasyCit

**EasyCit** é uma aplicação mobile desenvolvida com Jetpack Compose, focada em fornecer uma plataforma intuitiva no tema smartcity para uso de turistas e moradores locais. 
O app oferece informações gerais sobre uma cidade selecionada, incluindo pontos de interesse, mapas interativos, cultura e lazer, serviços de emergência, idioma, moeda e clima local.
Projeto desenvolvido para o StartupOne do segundo ano do curso de ADS da FIAP. 

## Funcionalidades

- **Tela de Login e Cadastro**: Funcionalidades para login de usuários e cadastro.
- **Home Screen**: Tela principal com informações sobre a cidade e serviços.
- **Navegação**: Sistema de navegação entre as diferentes telas usando o `Navigation`.
- **Persistência de Dados**: Uso do `Room Database` para persistir dados locais de usuários e preferências.

  *Em construção*
- **Favoritos**: Permite aos usuários salvar pontos turísticos e serviços de emergência favoritos.
- **Integração com Google Maps**: Para criação de rotas entre locais.
- **Planificador de Roteiros**: Funcionalidade para os usuários planejarem seus itinerários.
- **Carteira Digital**: Para armazenar informações sobre transações e valores locais.
- **Suporte**: Canal de comunicação para atendimento ao usuário.

## Tecnologias Usadas

- **Jetpack Compose**: Framework para a construção de interfaces de usuário.
- **Room Database**: Banco de dados local para armazenamento de dados persistentes.
- **Google Maps API**: Para integração de rotas e localização.
- **Navigation Compose**: Para navegação entre telas do app.
- **Kotlin**: Linguagem de programação utilizada.

## Estrutura do Projeto

- **`app/`**: Diretório principal contendo os arquivos de código-fonte do app.
- **`build.gradle.kts`**: Configuração do Gradle para construção do app.
- **`gradle.properties`**: Configurações específicas do Gradle.
- **`gradle/`**: Scripts do Gradle para construção e configuração.

## Como Contribuir

1. Faça o fork deste repositório.
2. Crie uma branch para sua modificação (`git checkout -b feature/nova-feature`).
3. Faça o commit das suas alterações (`git commit -am 'Adicionando nova feature'`).
4. Envie para o repositório (`git push origin feature/nova-feature`).
5. Abra um Pull Request para revisão e merge.

## Como Rodar o Projeto Localmente

1. Clone o repositório:
   ```bash
   git clone https://github.com/viniciussrdev/easycit-app.git
Abra o projeto no Android Studio.

Configure o emulador ou conecte um dispositivo físico.

Execute o projeto no Android Studio.

*Em construção*

Licença
Este projeto está licenciado sob a Licença MIT - veja o arquivo LICENSE para mais detalhes.
