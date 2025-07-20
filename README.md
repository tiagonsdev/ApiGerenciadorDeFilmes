Atividade 1
Contexto
A empresa recebe uma nova demanda de uma casa cultural da cidade que conta com uma sala de cinema. O objetivo é montar um site para o estabelecimento, porém há uma seção específica na qual você trabalhará. Além da divulgação das ações do estabelecimento, a casa cultural quer um espaço em que as pessoas possam registrar os filmes a que assistiram e avaliar cada um deles (fornecer análises).
 
Concentrando-se nessa funcionalidade, neste momento de avaliações e protótipos, você deverá criar um sistema web que permita cadastrar filmes e realizar análises desses filmes cadastrados. Para isso, você precisará de duas entidades Model:
 
Filme: id, título, sinopse, gênero e ano de lançamento
Análise: id, filme, análise e nota
 
O cliente está ansioso para ver o projeto e, portanto, para fins de testes iniciais, o desenvolvimento deve ser feito utilizando apenas armazenamento em memória (sem banco de dados). Inclua, no sistema, páginas para cadastrar filmes e listar os filmes já cadastrados e uma página de detalhes que exibirá todas as informações sobre o filme selecionado, além de permitir adicionar uma análise.
 
Atividade
Usando o NetBens, desenvolva um sistema web Spring MVC sem banco de dados, de acordo com a descrição do contexto. Preste atenção nos passos a seguir:
 
Comece criando um projeto no Spring Initializr.
Defina as entidades Filme e Análise.
Crie classes de controlador para manipular as requisições HTTP (hyper text transfer protocol), como cadastrar um filme assistido e adicionar uma análise.
Implemente as visualizações – páginas HTML (hyper text markup language) – para a interação do usuário, como formulários para cadastrar um filme e adicionar uma análise.
Teste o sistema web sem banco de dados, verificando se as funcionalidades básicas estão funcionando corretamente.



Atividade 2
Contexto
O cliente ficou muito animado com o seu último projeto e viu grande potencial no sistema que você está construindo. Ele imagina ser possível expandir, para que outros sites utilizem o sistema de avaliação, ou até mesmo criar aplicativos móveis com essas funcionalidades. Uma alternativa muito interessante para essas integrações entre sistemas é a disponibilização de uma API (application programming interface) REST.
 
Nesta etapa, portanto, sua tarefa será criar uma prova de conceito para essa ideia, desenvolvendo uma API REST com base no projeto implementado na atividade anterior. Para essas funcionalidades, haverá uso de banco de dados, e não mais apenas dados em memória.
 
Atividade
No NetBeans, usando o projeto desenvolvido na atividade anterior, crie um novo controlador REST que atenderá às requisições GET, POST, PUT e DELETE. É importante que a API REST consiga atender a todas as requisições e que os dados persistam em um banco de dados. Os testes acontecerão via Postman.
 
Siga os passos a seguir:
 
Crie um novo controlador no projeto iniciado na atividade anterior.
Configure o banco de dados (MySQL) para armazenar os dados dos filmes e as análises.
Implemente os controladores REST para manipular as requisições GET, POST, PUT e DELETE relacionadas aos filmes e às análises.
Realize testes das chamadas à API utilizando o Postman e registre os testes feitos com capturas de tela de cada requisição.
 
Entrega
No espaço dedicado à entrega da atividade, envie um arquivo compactado (ZIP, RAR ou 7z) contendo o projeto NetBeans, o script de criação do banco de dados (SQL) e as capturas de tela de todos os testes realizados com o Postman.
 
Dica de leitura
Para esta atividade, leia os seguintes materiais:
Web services e API
Linguagem de programação para back-end
Banco de dados
Segurança da informação
 
Avaliação
Nesta atividade, você será avaliado nos indicadores:
Desenvolve recursos de segurança de dados de acordo com princípios de segurança da informação e tecnologia web.
Utiliza comandos de integração dos objetos de bancos de dados de acordo com tecnologia web e os requisitos do sistema.
