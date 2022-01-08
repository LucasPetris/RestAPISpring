# <h1>Desafio PubFuture - RestApi em Java - </h1>

<p> <Strong> Desafio lançada pela Publica, desenvolvido com o framework Spring na linguagem Java com uma Rest API consumindo os Dados. </strong> </p>

<h2> Tecnologias Utilizadas: </h2>

<li> <b> JDK 11 </b> </li>
<li> <b> Maven </b> </li>
<li> <b> Spring Boot Framewoork </b> </li>

<h2> Ambientes de Desenvolvimento utilizados: </h2>

<li>  <b> Visual Studio Code </b> </li>
<li>  <b> MySql WorkBranch </b> </li>

<h2> Etapas para executar o projeto </h2>

<p>   Primeiramente precisamos ligar as portas pelo XAMPP (ou se preferir XAMP) 
que são as utilizadas pelo Apache e MySql (Portas 80, 443, 3306).
<br>
  Com as portas abertas podemos Executar a Classe Main (RestapiApplication.java) que é responsável por
cuidar de todos repositorios, iniciar o TomCat (porta 8080) e fazer a conexão com o Banco de Dados.
(Podemos executar via Spring Boot Dashboard também.)

<h2> Registrando os dados pelo advanced rest client através do protocolo HTTP </h2>
  
<p>
  Com a aplicação rodando e o servidor online podemos manipular os dados do tipo JSON, referente ao link de acesso
  podemos por exemplo acessar pelo GET http://localhost:8080/contas ele deve retornar uma resposta de conexão 200 <br>
  Se a comunicação com o servidor local foi sucedida podemos alterar para o POST podemos selecionar o Body e 
  escrever os Raw Input com o modelo JSON. 
  Exemplo de registro para realizar nesse Projeto:
  
  <h3> Para Entidade Contas -> <br> </h3>
  {
    "conta": "1",
    "saldo": "1500",
    "tipoConta": "carteira",
    "instituicaoFinanceira": "Viacredi"
  }
  
  <h3>  Para Entidade Receitas -> <br> </h3>
  
  {
   "conta": "1",
   "valor": "25000",
   "descricao": "Transferencia bancaria realizada pelo Banco Viacredi",
   "tipoReceita": "Presente",
   "dataRecebimento": "2016-10-18",
   "dataRecebimentoEsperado": "2015-10-25"
  }
  
  <h3> Para Entidade Despesas -> <br> </h3>
  
  {
    "conta": 1,
    "valor": 1600,
    "tipoDespesa": "Lazer",
    "dataPagamento": "2021-01-03",
    "dataPagamentoEsperado": "2020-12-16"
  }
  
  <br>
  
  Os registros devem ser feitos com a URL correspondente de cada Entidade nos metodos elaborados.
  <li> http://localhost:8080/contas para a entidade Contas </li>
  <li> http://localhost:8080/receitas para a entidade Receitas </li>
  <li> http://localhost:8080/despesas para a entidade Despesas </li>
  
 O framework se responsabiliza por comunicar ao banco de dados registrado na <strong> application.properties </strong>
sendo que podemos visualizar as colunas e os registros pelo MySql Workbench ou pelo Postgre Sql 
</p>

<h2> Classes que contém os metódos requeridos </h2>

<li> ContasREST.java </li>
<p> 
Métodos Listar todas contas, listar Saldo Total, Salvar, Alterar e Deletar.
</p>

<br>

<li> ReceitasREST.java </li>
<p> 
Métodos Listar Todas Receitas, Listar as receitas registradas tipo Salário, Listar pelo tipo Outros e Listar pelo tipo Presente. <br>
A filtragem está aplicada também no método Listar por Data.
</p>

<br>

<li> DespesasREST.java </li>
<p>
Métodos Listar todas Despesas, Listar pelas Despesas registrada do tipo Alimentação, Educação, Moradia e Roupa. <br>
Filtragem de data inicial e final pelo método Listar por data.
</p>

![Preview](https://github.com/LucasPetris/DesafioPubFutureRestApi/blob/main/RestAPICRUD.drawio.png)

<h2> Acessando pela Web Service as Filtragens com Querys </h2>

<p> 
  http://localhost:8080/contas/findSaldoTotal -> Listar o Saldo Total de todas Contas
  <br>
  
  <strong> Filtragem por tipo de Despesa: </strong> <br>
  
  <li> http://localhost:8080/despesas/getByTipoDespesaAlimentacao </li>
  <li> http://localhost:8080/despesas/getByTipoDespesaEducacao </li>
  <li> http://localhost:8080/despesas/getByTipoDespesaMoradia </li>
  <li> http://localhost:8080/despesas/getByTipoDespesaRoupa </li>
  <br>
  
  <strong> Filtragem por Data inicial e Data final da Despesa: </strong> 
  <br>
  
  <li> http://localhost:8080/despesas/findByDataPagamento </li>
  <br>
  <strong> Filtragem por Tipos de Receitas </strong> 
  <br>
  
  <li> http://localhost:8080/receitas/getByTipoReceitaSalario </li>
  <li> http://localhost:8080/receitas/getByTipoReceitaOutros </li>
  <li> http://localhost:8080/receitas/getByTipoReceitaPresente </li>
  <br>
  
  <strong> Filtragem por Data inicial e Data final das Receitas </strong> 
  <br>
  
  <li> http://localhost:8080/receitas/findByDataRecebimento </li>
</p>

<h2> Configurando algumas propriedades do application.properties para executar sem falhas a API </h2>
<p>

spring.jpa.hibernate.ddl-auto=update <br>
spring.datasource.url=jdbc:mysql://localhost:3306/<b>inserirnomedodatabasecriado</b> <br>
spring.datasource.username=<b>inserirusuariodobanco</b> <br>
spring.datasource.password=<b>inserirsenhadobanco</b> <br>
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver <b>(para banco de dados MySql)</b> <br>
server.port=8080

</p>



