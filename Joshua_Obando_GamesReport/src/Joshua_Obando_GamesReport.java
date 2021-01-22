/**
 *  The following program will read a data file (.csv) that contains gamer scores, and produce a report that shows the gamers, their scores and a total
 * @author Josh Obando
 * @version 1.0
*/

import java.io.*;


public class Joshua_Obando_GamesReport {

	public static void main(String[] args) throws IOException {
	
		String filePath = "C://Data//GameScores.csv";
		File gameFile = new File(filePath);
		buildReport(gameFile);
		addGamer(gameFile, "Jimmy", 189, 190, 197, 199, 198, 193, 199, 199, 188, 196);
		buildReport(gameFile);
	}
	
	private static void buildReport(File gameFile) throws IOException 
	{
		if (gameFile.exists()) 
    	{
            BufferedReader br = null;
            String line = "";
            String cvsSplitBy = ",";
            int recordCount = 0;
			br = new BufferedReader(new FileReader(gameFile));
			horizontalLine(96);
			System.out.println("Gaming Report");
			horizontalLine(96);
			System.out.println("Gamer	1	2	3	4	5	6	7	8	9	10	Total");
			horizontalLine(96);
			Integer totalScores = 0;
			int topScore = 0;
			String topName = "";
			
			while ((line = br.readLine()) != null) 
			{
				String[] gamers = line.split(cvsSplitBy);
				
				totalScores = Integer.parseInt(gamers[1]) + Integer.parseInt(gamers[1+1])+ Integer.parseInt(gamers[1+2])+ Integer.parseInt(gamers[1+3])+ Integer.parseInt(gamers[1+4])+ Integer.parseInt(gamers[1+5])+ Integer.parseInt(gamers[1+6])+ Integer.parseInt(gamers[1+7])+ Integer.parseInt(gamers[1+8])+ Integer.parseInt(gamers[(gamers.length)-1]);
				
				if (totalScores > topScore)
					{
						topScore = totalScores;
						topName = gamers[0];
					}
				
				System.out.println(gamers[0] + "\t" 
								+ gamers[1]  + "\t" 
								+ gamers[2]  + "\t" 
								+ gamers[3]  + "\t" 
								+ gamers[4]  + "\t" 
								+ gamers[5]  + "\t" 
								+ gamers[6]  + "\t" 
								+ gamers[7]  + "\t" 
								+ gamers[8]  + "\t" 
								+ gamers[9]  + "\t" 
								+ gamers[10] + "\t"
								+ totalScores) ;
				recordCount++;
			}
			
			System.out.println();
			horizontalLine(96);
			System.out.printf("Number of gamers: %d%n", recordCount);
			System.out.println("Top Gamer: " + topName );
			horizontalLine(96);
            br.close();
            gameFile = null;
        
    	}
		else
		{
			System.out.println("File not found.");
		}
	}
	
	/**
	 * 
	 * The following method will add a Gamer record to the GameScores.csv file with the int parameters as scores and String parameter as the name.
	 * 
	 * @throws IOException
	 */
	private static void addGamer(File gameFile, String fname, int score1, int score2, int score3, int score4, int score5, int score6, int score7, int score8, int score9, int score10) throws IOException
	{
		FileWriter gamerWriter = new FileWriter(gameFile, true);
		gamerWriter.write(fname + "," + score1 + "," + score2 + "," + score3 + "," + score4 + "," + score5 + "," + score6 + "," + score7 + "," + score8 + "," + score9 + "," + score10 + "\r\n");
		gamerWriter.close();
	}

	/**
	 * Added method for simpler line divider
	 * @param dashes
	 */
	private static void horizontalLine(int dashes)
	{
		for (int i = 1; i <= dashes; i++)
		{
			System.out.print("-");
		}
		System.out.println();
	}
}
