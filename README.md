# db

Resolução do problema:
1) O primeiro passo foi buscar as informações do arquivo .csv; 
2) Após, as informações tiveram de ser tratadas, ou seja, remover o hífen da conta e substituir a vírgula pelo ponto no saldo;
3) Foi criado uma lista para gravar essas informações tratadas;
4) Chamou-se a função ReceitaService para validar os dados e indicar se é true ou false;
5) Por fim, foi criado um novo arquivo .csv com uma nova coluna, indicando se o resultado foi verdadeiro ou falso.

Problemas encontrados: Como nunca utilizei o Spring Boot, encontrei dificuldades para utilizá-lo e, por este motivo, 
acabei fazendo da maneira que achei que conseguiria concluir a atividade;

A versão do jdk utilizada foi 17.0.3.1;

Para testar o código:
1) Você precisa baixar o arquivo .csv ou criar um novo seguindo o mesmo formato, ou seja, com cabeçalho na primeira linha e as colunas na seguinte ordem:
Agencia, conta, saldo, status;
2) No arquivo CSVReader, deve-se alterar a variável path, para localizar o arquivo baixado ou criado;
3) Alterar a variável newPath, indicando onde o arquivo deve ser salvo no seu computador;
4) Rodar o programa.
