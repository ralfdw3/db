
	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.ArrayList;
	import java.util.List;



	public class CsvHandler2 {
		public void createCsv (List<Account> contaLista, String path) {
			try (PrintWriter writer = new PrintWriter(path)) {
	      StringBuilder sb = new StringBuilder();
	      sb.append("agencia");
	      sb.append(',');
	      sb.append("conta");
	      sb.append(',');
	      sb.append("saldo");
	      sb.append(',');
	      sb.append("status");
	      sb.append(',');
	      sb.append("resultado");
	      sb.append('\n');

	for (Account conta : contaLista){

	      sb.append(conta.getAgency());
	      sb.append(',');
	      sb.append(conta.getAccount());
	      sb.append(',');
	      sb.append(conta.getBalance());
	      sb.append(',');
	      sb.append(conta.getStatus());
	      sb.append(',');
	      sb.append(conta.getResult());
	      sb.append('\n');
	}

	      writer.write(sb.toString());

	    } catch (FileNotFoundException e) {
	      System.out.println(e.getMessage());
	 } 
}
		
		public List<Account> readCsv (String path) throws RuntimeException, InterruptedException {
			List<Account> list = new ArrayList<Account>();
			
			try {
				BufferedReader br = new BufferedReader(new FileReader(path));
				String line = br.readLine(); // Lê a primeira linha para deixar o cabeçalho fora
				line = br.readLine();
				while(line != null){ //Vai percorrer o documento até a última linha
					
					String[] values = line.split(";");
					
					String agencia = values[0];
					String conta = values[1].replace("-","");
					Double saldo = Double.parseDouble (values[2].replace(',', '.'));
					String status = values[3];
					
					ReceitaService rs = new ReceitaService();
					boolean resultado = rs.atualizarConta(agencia, conta, saldo, status);
			
					Account accounts = new Account(agencia, conta, saldo, status, resultado);
					list.add(accounts);
					
					line = br.readLine();
					}
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} 
			return list;
			
	}

}


