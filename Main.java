import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.google.gson.Gson;

/**
 * @author Adriano Zimmermann
 *
 */

public class Main {

	public static void main(String[] args) throws IOException {

		int laranjeiras = 0, santaClara = 0, boaVista = 0, jardimAmerica = 0, centro = 0, sumaré = 0, budag = 0,
				barraDoTrombudo = 0, santaRita = 0, jardimAlexandre = 0, santana = 0, taboão = 0, belaAliança = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Escolha o mês para ver as estatisticas");

		int op = scanner.nextInt();

		Gerador gerador = new Gerador();
		System.out.print(gerador);

		List<Ocorrencia> ocorrencias = new ArrayList<>();

		Random ran = new Random();
		Calendar calendario = Calendar.getInstance();

		for (int i = 0; i < gerador.hom; i++) {
			Ocorrencia oco = new Ocorrencia();
			if (op == 2) {
				calendario.set(Calendar.DAY_OF_MONTH, ran.nextInt(28) + 1);
			} else if ((op == 1) || (op == 3) || (op == 5) || (op == 7) || (op == 8) || (op == 10) || (op == 12)) {
				calendario.set(Calendar.DAY_OF_MONTH, ran.nextInt(31) + 1);
			} else {
				calendario.set(Calendar.DAY_OF_MONTH, ran.nextInt(30) + 1);
			}
			calendario.set(Calendar.MONTH, op - 1);
			calendario.set(Calendar.YEAR, 2019);
			calendario.set(Calendar.HOUR_OF_DAY, ran.nextInt(25) + 1);
			calendario.set(Calendar.MINUTE, ran.nextInt(60));
			calendario.set(Calendar.SECOND, ran.nextInt(60));
			Date dt = calendario.getTime();
			oco.setData(dt);
			int a = ran.nextInt(4);
			if (a == 0) {
				oco.setAutor("F");
			} else {
				oco.setAutor("H");
			}
			oco.setTipo(TipoOcorrencias.Homicídio);
			int b = ran.nextInt(14) + 1;
			switch (b) {
			case 1:
				oco.setLocal(Bairros.Laranjeiras);
				laranjeiras++;
				break;
			case 2:
				oco.setLocal(Bairros.SantaClara);
				santaClara++;
				break;
			case 3:
				oco.setLocal(Bairros.BoaVista);
				boaVista++;
				break;
			case 4:
				oco.setLocal(Bairros.JardimAmerica);
				jardimAmerica++;
				break;
			case 5:
				oco.setLocal(Bairros.Centro);
				centro++;
				break;
			case 6:
				oco.setLocal(Bairros.Sumaré);
				sumaré++;
				break;
			case 7:
				oco.setLocal(Bairros.Budag);
				budag++;
				break;
			case 8:
				oco.setLocal(Bairros.BarraDoTrombudo);
				barraDoTrombudo++;
				break;
			case 9:
				oco.setLocal(Bairros.SantaRita);
				santaRita++;
				break;
			case 10:
				oco.setLocal(Bairros.JardimAlexandre);
				jardimAlexandre++;
				break;
			case 11:
				oco.setLocal(Bairros.Santana);
				santana++;
				break;
			case 12:
				oco.setLocal(Bairros.Taboão);
				taboão++;
				break;
			case 13:
				oco.setLocal(Bairros.BelaAliança);
				belaAliança++;
				break;
			}

			ocorrencias.add(oco);
		}

		for (int i = 0; i < gerador.fem; i++) {
			Ocorrencia oco = new Ocorrencia();
			if (op == 2) {
				calendario.set(Calendar.DAY_OF_MONTH, ran.nextInt(28) + 1);
			} else if ((op == 1) || (op == 3) || (op == 5) || (op == 7) || (op == 8) || (op == 10) || (op == 12)) {
				calendario.set(Calendar.DAY_OF_MONTH, ran.nextInt(31) + 1);
			} else {
				calendario.set(Calendar.DAY_OF_MONTH, ran.nextInt(30) + 1);
			}
			calendario.set(Calendar.MONTH, op - 1);
			calendario.set(Calendar.YEAR, 2019);
			calendario.set(Calendar.HOUR_OF_DAY, ran.nextInt(25) + 1);
			calendario.set(Calendar.MINUTE, ran.nextInt(60));
			calendario.set(Calendar.SECOND, ran.nextInt(60));
			Date dt = calendario.getTime();
			oco.setData(dt);
			oco.setAutor("H");
			oco.setTipo(TipoOcorrencias.Feminicídio);
			int b = ran.nextInt(14) + 1;
			switch (b) {
			case 1:
				oco.setLocal(Bairros.Laranjeiras);
				laranjeiras++;
				break;
			case 2:
				oco.setLocal(Bairros.SantaClara);
				santaClara++;
				break;
			case 3:
				oco.setLocal(Bairros.BoaVista);
				boaVista++;
				break;
			case 4:
				oco.setLocal(Bairros.JardimAmerica);
				jardimAmerica++;
				break;
			case 5:
				oco.setLocal(Bairros.Centro);
				centro++;
				break;
			case 6:
				oco.setLocal(Bairros.Sumaré);
				sumaré++;
				break;
			case 7:
				oco.setLocal(Bairros.Budag);
				budag++;
				break;
			case 8:
				oco.setLocal(Bairros.BarraDoTrombudo);
				barraDoTrombudo++;
				break;
			case 9:
				oco.setLocal(Bairros.SantaRita);
				santaRita++;
				break;
			case 10:
				oco.setLocal(Bairros.JardimAlexandre);
				jardimAlexandre++;
				break;
			case 11:
				oco.setLocal(Bairros.Santana);
				santana++;
				break;
			case 12:
				oco.setLocal(Bairros.Taboão);
				taboão++;
				break;
			case 13:
				oco.setLocal(Bairros.BelaAliança);
				belaAliança++;
				break;
			}

			ocorrencias.add(oco);
		}

		for (int i = 0; i < gerador.ass; i++) {
			Ocorrencia oco = new Ocorrencia();
			if (op == 2) {
				calendario.set(Calendar.DAY_OF_MONTH, ran.nextInt(28) + 1);
			} else if ((op == 1) || (op == 3) || (op == 5) || (op == 7) || (op == 8) || (op == 10) || (op == 12)) {
				calendario.set(Calendar.DAY_OF_MONTH, ran.nextInt(31) + 1);
			} else {
				calendario.set(Calendar.DAY_OF_MONTH, ran.nextInt(30) + 1);
			}
			calendario.set(Calendar.MONTH, op - 1);
			calendario.set(Calendar.YEAR, 2019);
			calendario.set(Calendar.HOUR_OF_DAY, ran.nextInt(25) + 1);
			calendario.set(Calendar.MINUTE, ran.nextInt(60));
			calendario.set(Calendar.SECOND, ran.nextInt(60));
			Date dt = calendario.getTime();
			oco.setData(dt);
			int a = ran.nextInt(6);
			if (a == 0) {
				oco.setAutor("F");
			} else {
				oco.setAutor("H");
			}
			oco.setTipo(TipoOcorrencias.Assalto);
			int b = ran.nextInt(14) + 1;
			switch (b) {
			case 1:
				oco.setLocal(Bairros.Laranjeiras);
				laranjeiras++;
				break;
			case 2:
				oco.setLocal(Bairros.SantaClara);
				santaClara++;
				break;
			case 3:
				oco.setLocal(Bairros.BoaVista);
				boaVista++;
				break;
			case 4:
				oco.setLocal(Bairros.JardimAmerica);
				jardimAmerica++;
				break;
			case 5:
				oco.setLocal(Bairros.Centro);
				centro++;
				break;
			case 6:
				oco.setLocal(Bairros.Sumaré);
				sumaré++;
				break;
			case 7:
				oco.setLocal(Bairros.Budag);
				budag++;
				break;
			case 8:
				oco.setLocal(Bairros.BarraDoTrombudo);
				barraDoTrombudo++;
				break;
			case 9:
				oco.setLocal(Bairros.SantaRita);
				santaRita++;
				break;
			case 10:
				oco.setLocal(Bairros.JardimAlexandre);
				jardimAlexandre++;
				break;
			case 11:
				oco.setLocal(Bairros.Santana);
				santana++;
				break;
			case 12:
				oco.setLocal(Bairros.Taboão);
				taboão++;
				break;
			case 13:
				oco.setLocal(Bairros.BelaAliança);
				belaAliança++;
				break;
			}

			ocorrencias.add(oco);
		}

		for (int i = 0; i < gerador.fur; i++) {
			Ocorrencia oco = new Ocorrencia();
			if (op == 2) {
				calendario.set(Calendar.DAY_OF_MONTH, ran.nextInt(28) + 1);
			} else if ((op == 1) || (op == 3) || (op == 5) || (op == 7) || (op == 8) || (op == 10) || (op == 12)) {
				calendario.set(Calendar.DAY_OF_MONTH, ran.nextInt(31) + 1);
			} else {
				calendario.set(Calendar.DAY_OF_MONTH, ran.nextInt(30) + 1);
			}
			calendario.set(Calendar.MONTH, op - 1);
			calendario.set(Calendar.YEAR, 2019);
			calendario.set(Calendar.HOUR_OF_DAY, ran.nextInt(25) + 1);
			calendario.set(Calendar.MINUTE, ran.nextInt(60));
			calendario.set(Calendar.SECOND, ran.nextInt(60));
			Date dt = calendario.getTime();
			oco.setData(dt);
			int a = ran.nextInt(6);
			if (a == 0) {
				oco.setAutor("F");
			} else {
				oco.setAutor("H");
			}
			oco.setTipo(TipoOcorrencias.Furto);
			int b = ran.nextInt(14) + 1;
			switch (b) {
			case 1:
				oco.setLocal(Bairros.Laranjeiras);
				laranjeiras++;
				break;
			case 2:
				oco.setLocal(Bairros.SantaClara);
				santaClara++;
				break;
			case 3:
				oco.setLocal(Bairros.BoaVista);
				boaVista++;
				break;
			case 4:
				oco.setLocal(Bairros.JardimAmerica);
				jardimAmerica++;
				break;
			case 5:
				oco.setLocal(Bairros.Centro);
				centro++;
				break;
			case 6:
				oco.setLocal(Bairros.Sumaré);
				sumaré++;
				break;
			case 7:
				oco.setLocal(Bairros.Budag);
				budag++;
				break;
			case 8:
				oco.setLocal(Bairros.BarraDoTrombudo);
				barraDoTrombudo++;
				break;
			case 9:
				oco.setLocal(Bairros.SantaRita);
				santaRita++;
				break;
			case 10:
				oco.setLocal(Bairros.JardimAlexandre);
				jardimAlexandre++;
				break;
			case 11:
				oco.setLocal(Bairros.Santana);
				santana++;
				break;
			case 12:
				oco.setLocal(Bairros.Taboão);
				taboão++;
				break;
			case 13:
				oco.setLocal(Bairros.BelaAliança);
				belaAliança++;
				break;
			}

			ocorrencias.add(oco);
		}

		for (int i = 0; i < gerador.acidenteT; i++) {
			Ocorrencia oco = new Ocorrencia();
			if (op == 2) {
				calendario.set(Calendar.DAY_OF_MONTH, ran.nextInt(28) + 1);
			} else if ((op == 1) || (op == 3) || (op == 5) || (op == 7) || (op == 8) || (op == 10) || (op == 12)) {
				calendario.set(Calendar.DAY_OF_MONTH, ran.nextInt(31) + 1);
			} else {
				calendario.set(Calendar.DAY_OF_MONTH, ran.nextInt(30) + 1);
			}
			calendario.set(Calendar.MONTH, op - 1);
			calendario.set(Calendar.YEAR, 2019);
			calendario.set(Calendar.HOUR_OF_DAY, ran.nextInt(25) + 1);
			calendario.set(Calendar.MINUTE, ran.nextInt(60));
			calendario.set(Calendar.SECOND, ran.nextInt(60));
			Date dt = calendario.getTime();
			oco.setData(dt);
			int a = ran.nextInt(3);
			if (a == 0) {
				oco.setAutor("F");
			} else {
				oco.setAutor("H");
			}
			oco.setTipo(TipoOcorrencias.AcidentesDeTrânsito);
			int b = ran.nextInt(14) + 1;
			switch (b) {
			case 1:
				oco.setLocal(Bairros.Laranjeiras);
				laranjeiras++;
				break;
			case 2:
				oco.setLocal(Bairros.SantaClara);
				santaClara++;
				break;
			case 3:
				oco.setLocal(Bairros.BoaVista);
				boaVista++;
				break;
			case 4:
				oco.setLocal(Bairros.JardimAmerica);
				jardimAmerica++;
				break;
			case 5:
				oco.setLocal(Bairros.Centro);
				centro++;
				break;
			case 6:
				oco.setLocal(Bairros.Sumaré);
				sumaré++;
				break;
			case 7:
				oco.setLocal(Bairros.Budag);
				budag++;
				break;
			case 8:
				oco.setLocal(Bairros.BarraDoTrombudo);
				barraDoTrombudo++;
				break;
			case 9:
				oco.setLocal(Bairros.SantaRita);
				santaRita++;
				break;
			case 10:
				oco.setLocal(Bairros.JardimAlexandre);
				jardimAlexandre++;
				break;
			case 11:
				oco.setLocal(Bairros.Santana);
				santana++;
				break;
			case 12:
				oco.setLocal(Bairros.Taboão);
				taboão++;
				break;
			case 13:
				oco.setLocal(Bairros.BelaAliança);
				belaAliança++;
				break;
			}

			ocorrencias.add(oco);
		}

		for (int i = 0; i < gerador.mariaP; i++) {
			Ocorrencia oco = new Ocorrencia();
			if (op == 2) {
				calendario.set(Calendar.DAY_OF_MONTH, ran.nextInt(28) + 1);
			} else if ((op == 1) || (op == 3) || (op == 5) || (op == 7) || (op == 8) || (op == 10) || (op == 12)) {
				calendario.set(Calendar.DAY_OF_MONTH, ran.nextInt(31) + 1);
			} else {
				calendario.set(Calendar.DAY_OF_MONTH, ran.nextInt(30) + 1);
			}
			calendario.set(Calendar.MONTH, op - 1);
			calendario.set(Calendar.YEAR, 2019);
			calendario.set(Calendar.HOUR_OF_DAY, ran.nextInt(25) + 1);
			calendario.set(Calendar.MINUTE, ran.nextInt(60));
			calendario.set(Calendar.SECOND, ran.nextInt(60));
			Date dt = calendario.getTime();
			oco.setData(dt);
			int a = ran.nextInt(8);
			if (a == 0) {
				oco.setAutor("F");
			} else {
				oco.setAutor("H");
			}
			oco.setTipo(TipoOcorrencias.MariaDaPenha);
			int b = ran.nextInt(13) + 1;
			switch (b) {
			case 1:
				oco.setLocal(Bairros.Laranjeiras);
				laranjeiras++;
				break;
			case 2:
				oco.setLocal(Bairros.SantaClara);
				santaClara++;
				break;
			case 3:
				oco.setLocal(Bairros.BoaVista);
				boaVista++;
				break;
			case 4:
				oco.setLocal(Bairros.JardimAmerica);
				jardimAmerica++;
				break;
			case 5:
				oco.setLocal(Bairros.Centro);
				centro++;
				break;
			case 6:
				oco.setLocal(Bairros.Sumaré);
				sumaré++;
				break;
			case 7:
				oco.setLocal(Bairros.Budag);
				budag++;
				break;
			case 8:
				oco.setLocal(Bairros.BarraDoTrombudo);
				barraDoTrombudo++;
				break;
			case 9:
				oco.setLocal(Bairros.SantaRita);
				santaRita++;
				break;
			case 10:
				oco.setLocal(Bairros.JardimAlexandre);
				jardimAlexandre++;
				break;
			case 11:
				oco.setLocal(Bairros.Santana);
				santana++;
				break;
			case 12:
				oco.setLocal(Bairros.Taboão);
				taboão++;
				break;
			case 13:
				oco.setLocal(Bairros.BelaAliança);
				belaAliança++;
				break;
			}

			ocorrencias.add(oco);
		}

		for (int i = 0; i < gerador.viasDeF; i++) {
			Ocorrencia oco = new Ocorrencia();
			if (op == 2) {
				calendario.set(Calendar.DAY_OF_MONTH, ran.nextInt(28) + 1);
			} else if ((op == 1) || (op == 3) || (op == 5) || (op == 7) || (op == 8) || (op == 10) || (op == 12)) {
				calendario.set(Calendar.DAY_OF_MONTH, ran.nextInt(31) + 1);
			} else {
				calendario.set(Calendar.DAY_OF_MONTH, ran.nextInt(30) + 1);
			}
			calendario.set(Calendar.MONTH, op - 1);
			calendario.set(Calendar.YEAR, 2019);
			calendario.set(Calendar.HOUR_OF_DAY, ran.nextInt(25) + 1);
			calendario.set(Calendar.MINUTE, ran.nextInt(60));
			calendario.set(Calendar.SECOND, ran.nextInt(60));
			Date dt = calendario.getTime();
			oco.setData(dt);
			int a = ran.nextInt(4);
			if (a == 0) {
				oco.setAutor("F");
			} else {
				oco.setAutor("H");
			}
			oco.setTipo(TipoOcorrencias.ViasDeFato);
			int b = ran.nextInt(14) + 1;
			switch (b) {
			case 1:
				oco.setLocal(Bairros.Laranjeiras);
				laranjeiras++;
				break;
			case 2:
				oco.setLocal(Bairros.SantaClara);
				santaClara++;
				break;
			case 3:
				oco.setLocal(Bairros.BoaVista);
				boaVista++;
				break;
			case 4:
				oco.setLocal(Bairros.JardimAmerica);
				jardimAmerica++;
				break;
			case 5:
				oco.setLocal(Bairros.Centro);
				centro++;
				break;
			case 6:
				oco.setLocal(Bairros.Sumaré);
				sumaré++;
				break;
			case 7:
				oco.setLocal(Bairros.Budag);
				budag++;
				break;
			case 8:
				oco.setLocal(Bairros.BarraDoTrombudo);
				barraDoTrombudo++;
				break;
			case 9:
				oco.setLocal(Bairros.SantaRita);
				santaRita++;
				break;
			case 10:
				oco.setLocal(Bairros.JardimAlexandre);
				jardimAlexandre++;
				break;
			case 11:
				oco.setLocal(Bairros.Santana);
				santana++;
				break;
			case 12:
				oco.setLocal(Bairros.Taboão);
				taboão++;
				break;
			case 13:
				oco.setLocal(Bairros.BelaAliança);
				belaAliança++;
				break;
			}

			ocorrencias.add(oco);
		}

		for (Ocorrencia x : ocorrencias) {
			System.out.println(x);
		}

		Gson builder = new Gson();
		Gson gson = builder;
		FileWriter writer = new FileWriter("lib/Ocorrencias" + op + ".json");
		writer.write(gson.toJson(ocorrencias));
		writer.close();

		System.out.println(gson.toJson(ocorrencias));

		String inicio = "<html>\r\n" + "  <head>\r\n"
				+ "    <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\r\n"
				+ "    <script type=\"text/javascript\">\r\n"
				+ "      google.charts.load('current', {'packages':['corechart']});\r\n"
				+ "      google.charts.setOnLoadCallback(drawChart);\r\n" + "\r\n" + "      function drawChart() {";
		String end = "var options = {\r\n" + "          title: 'Ocorrencias'\r\n" + "        };\r\n" + "\r\n"
				+ "        var chart = new google.visualization.PieChart(document.getElementById('piechart'));\r\n"
				+ "\r\n" + "        chart.draw(data, options);\r\n" + "      }\r\n" + "    </script>\r\n"
				+ "  </head>\r\n" + "  <body>\r\n"
				+ "    <div id=\"piechart\" style=\"width: 900px; height: 500px;\"></div>\r\n" + "  </body>\r\n"
				+ "</html>";
		try {
			FileWriter googlechartss = new FileWriter("Ocorrencias_mes" + (op) + ".html");
			PrintWriter printhtml = new PrintWriter(googlechartss);

			printhtml.printf(inicio);
			printhtml.printf(" var data = google.visualization.arrayToDataTable([\r\n"
					+ "          ['Ocorrencias', 'Mês ='],\r\n" + "          ['Homicidios',     " + gerador.hom
					+ "],\r\n" + "          ['Feminicidios',      " + gerador.fem + "],\r\n"
					+ "          ['Assaltos',     " + gerador.ass + "],\r\n" + "          ['Furtos',      "
					+ gerador.fur + "],\r\n" + "          ['Acidentes de Trânsito',     " + gerador.acidenteT + "],\r\n"
					+ "          ['Maria da Penha',      " + gerador.mariaP + "],\r\n"
					+ "          ['Vias de Fatos',     " + gerador.viasDeF + "],\r\n" + "]);\r\n" + ";");

			printhtml.printf(end);
			googlechartss.close();

		} catch (java.io.IOException erro) {
		}

		String inicio2 = "<html>\r\n" + "  <head>\r\n"
				+ "    <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\r\n"
				+ "    <script type=\"text/javascript\">\r\n"
				+ "      google.charts.load('current', {'packages':['corechart']});\r\n"
				+ "      google.charts.setOnLoadCallback(drawChart);\r\n" + "\r\n" + "      function drawChart() {";
		String end2 = "var options = {\r\n" + "          title: 'Bairros'\r\n" + "        };\r\n" + "\r\n"
				+ "        var chart = new google.visualization.PieChart(document.getElementById('piechart'));\r\n"
				+ "\r\n" + "        chart.draw(data, options);\r\n" + "      }\r\n" + "    </script>\r\n"
				+ "  </head>\r\n" + "  <body>\r\n"
				+ "    <div id=\"piechart\" style=\"width: 900px; height: 500px;\"></div>\r\n" + "  </body>\r\n"
				+ "</html>";
		try {
			FileWriter googlechartss = new FileWriter("Bairros_mes" + (op) + ".html");
			PrintWriter printhtml = new PrintWriter(googlechartss);

			printhtml.printf(inicio2);
			printhtml.printf(" var data = google.visualization.arrayToDataTable([\r\n"
					+ "          ['Numero de ocorrencias nos bairros', 'Bairros ='],\r\n"
					+ "          ['Laranjeiras',     " + laranjeiras + "],\r\n" + "          ['Santa Clara',      "
					+ santaClara + "],\r\n" + "          ['Boa Vista',     " + boaVista + "],\r\n"
					+ "          ['Jardim America',      " + jardimAmerica + "],\r\n" + "          ['Centro',     "
					+ centro + "],\r\n" + "          ['Sumaré',      " + sumaré + "],\r\n" + "          ['Budag',      "
					+ budag + "],\r\n" + "          ['Barra Do Trombudo',      " + barraDoTrombudo + "],\r\n"
					+ "          ['Santa Rita',      " + santaRita + "],\r\n" + "          ['Jardim Alexandre',      "
					+ jardimAlexandre + "],\r\n" + "          ['Santana',      " + santana + "],\r\n"
					+ "          ['Taboão',      " + taboão + "],\r\n" + "          ['Bela Aliança',      "
					+ belaAliança + "],\r\n"  
					+ "]);\r\n" + ";");

			printhtml.printf(end2);
			googlechartss.close();

		} catch (java.io.IOException erro) {
		}

		Bairros localB = null;
		boolean j = true;

		System.out.println("Você deseja ver as estatisticas de algum bairro? Se SIM digite 1, caso NÃO digite 2.");
		int escolha = scanner.nextInt();
		boolean ba = false;
		while (j) {
			if ((escolha == 1) || (ba == true)) {
				ba = true;
				while (ba) {
					System.out.println(
							"Qual Bairro que você deseja extrair as informações? Digite o número para o bairro desejado.");
					System.out.println("1 - " + Bairros.Laranjeiras + "\n2 - " + Bairros.BarraDoTrombudo + "\n3 - "
							+ Bairros.BelaAliança + "\n4 - " + Bairros.BoaVista + "\n5 - " + Bairros.Budag + "\n6 - "
							+ Bairros.Centro + "\n7 - " + Bairros.JardimAlexandre + "\n8 - " + Bairros.JardimAmerica
							+ "\n9 - " + Bairros.SantaClara + "\n10 - " + Bairros.Santana + "\n11 - " + Bairros.Sumaré
							+ "\n12 - " + Bairros.SantaRita + "\n13 - " + Bairros.Taboão);

					int baT = scanner.nextInt();

					if (baT == 1) {
						localB = Bairros.Laranjeiras;
						ba = false;
					} else if (baT == 2) {
						localB = Bairros.BarraDoTrombudo;
						ba = false;
					} else if (baT == 3) {
						localB = Bairros.BelaAliança;
						ba = false;
					} else if (baT == 4) {
						localB = Bairros.BoaVista;
						ba = false;
					} else if (baT == 5) {
						localB = Bairros.Budag;
						ba = false;
					} else if (baT == 6) {
						localB = Bairros.Centro;
						ba = false;
					} else if (baT == 7) {
						localB = Bairros.JardimAlexandre;
						ba = false;
					} else if (baT == 8) {
						localB = Bairros.JardimAmerica;
						ba = false;
					} else if (baT == 9) {
						localB = Bairros.SantaClara;
						ba = false;
					} else if (baT == 10) {
						localB = Bairros.Santana;
						ba = false;
					} else if (baT == 11) {
						localB = Bairros.Sumaré;
						ba = false;
					} else if (baT == 12) {
						localB = Bairros.SantaRita;
						ba = false;
					} else if (baT == 13) {
						localB = Bairros.Taboão;
						ba = false;
					} else {
						ba = true;
					}
				}

				int hom = 0, fem = 0, ass = 0, fur = 0, acidT = 0, marP = 0, viasF = 0;
				Boolean k = true;
				boolean l = true;
				while (k) {

					for (Ocorrencia x : ocorrencias) {
						if (x.getLocal() == localB) {
							System.out.println(x.getTipo());
							if (x.getTipo() == TipoOcorrencias.Homicídio) {
								hom++;
							} else if (x.getTipo() == TipoOcorrencias.Feminicídio) {
								fem++;
							} else if (x.getTipo() == TipoOcorrencias.Assalto) {
								ass++;
							} else if (x.getTipo() == TipoOcorrencias.Furto) {
								fur++;
							} else if (x.getTipo() == TipoOcorrencias.AcidentesDeTrânsito) {
								acidT++;
							} else if (x.getTipo() == TipoOcorrencias.MariaDaPenha) {
								marP++;
							} else {
								viasF++;
							}

						}
					}
					String inicio3 = "<html>\r\n" + "  <head>\r\n"
							+ "    <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\r\n"
							+ "    <script type=\"text/javascript\">\r\n"
							+ "      google.charts.load('current', {'packages':['corechart']});\r\n"
							+ "      google.charts.setOnLoadCallback(drawChart);\r\n" + "\r\n"
							+ "      function drawChart() {";
					String end3 = "var options = {\r\n" + "          title: 'Bairro'\r\n" + "        };\r\n" + "\r\n"
							+ "        var chart = new google.visualization.PieChart(document.getElementById('piechart'));\r\n"
							+ "\r\n" + "        chart.draw(data, options);\r\n" + "      }\r\n" + "    </script>\r\n"
							+ "  </head>\r\n" + "  <body>\r\n"
							+ "    <div id=\"piechart\" style=\"width: 900px; height: 500px;\"></div>\r\n"
							+ "  </body>\r\n" + "</html>";
					try {
						FileWriter googlechartss = new FileWriter("Ocorrencias_mes" + localB + (op) + ".html");
						PrintWriter printhtml = new PrintWriter(googlechartss);

						printhtml.printf(inicio3);
						printhtml.printf(" var data = google.visualization.arrayToDataTable([\r\n"
								+ "          ['Ocorrencias', 'Mês ='],\r\n" + "          ['Homicidios',     " + hom
								+ "],\r\n" + "          ['Feminicidios',      " + fem + "],\r\n"
								+ "          ['Assaltos',     " + ass + "],\r\n" + "          ['Furtos',      " + fur
								+ "],\r\n" + "          ['Acidentes de Trânsito',     " + acidT + "],\r\n"
								+ "          ['Maria da Penha',      " + marP + "],\r\n"
								+ "          ['Vias de Fatos',     " + viasF + "],\r\n" + "]);\r\n" + ";");

						printhtml.printf(end3);
						googlechartss.close();

					} catch (java.io.IOException erro) {
					}

					while (l) {
						System.out.println(
								"Deseja retirar estatistica de outro Bairro? SIM - Digite 1.   NÃO - Digite 2.");
						int nova = scanner.nextInt();
						if (nova == 1) {
							hom = 0;
							fem = 0;
							ass = 0;
							fur = 0;
							acidT = 0;
							marP = 0;
							viasF = 0;
							k = false;
							l = false;
							j = true;
							ba = true;
						} else if (nova == 2) {
							k = false;
							l = false;
							j = false;
							System.out.println("Obrigado por usar nosso sistema");
						} else {
							System.out.println("Número errado Digite novamente.");
							l = true;
						}
					}

				}
			} else if (escolha == 2) {
				System.out.println("Obrigado por usar nosso sistema");
				j = false;
			} else {
				System.out.println("Número errado digite novamente.");
				j = true;
			}
		}

		scanner.close();
	}

}
