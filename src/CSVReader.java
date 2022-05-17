import java.util.List;

public class CSVReader {

	public static void main(String[] args) {

		String path = "C:\\Users\\RALF\\OneDrive\\Área de Trabalho\\contas.csv";
		String newPath = "C:\\Users\\RALF\\OneDrive\\Área de Trabalho\\resultado.csv";
		
		CsvHandler2 csvHandler = new CsvHandler2();
		
		try {
			List<Account> ContasLista = csvHandler.readCsv(path);
			for (Account conta : ContasLista) {
				System.out.println(conta);
			}
			
			csvHandler.createCsv(ContasLista, newPath);
		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}
		
	}
		
}


