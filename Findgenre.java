package source;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import objects.MovieClass;
import objects.RatingClass;

public class Findgenre {
	
	

	public String  getGenre(int mov_id){
		
		File f1 = new File("datasets/movie.data");
        ArrayList<MovieClass> moviesList = new ArrayList<MovieClass>();
        Scanner sc = new Scanner(f1);
        
        Map<Integer,String> movieId_name=new HashMap<Integer,String>();
        
        while (sc.hasNextLine()) {
            String d = sc.nextLine();

            String m[] = d.split("[|]");
            MovieClass movie = new Movie(Integer.parseInt(m[0]), m[1],Integer.parseInt( m[2]), m[3], m[4],
                    Integer.parseInt(m[5]), Integer.parseInt(m[6]), Integer.parseInt(m[7]),
                    Integer.parseInt(m[8]), Integer.parseInt(m[9]), Integer.parseInt(m[10]),
                    Integer.parseInt(m[11]), Integer.parseInt(m[12]), Integer.parseInt(m[13]),
                    Integer.parseInt(m[14]), Integer.parseInt(m[15]), Integer.parseInt(m[16]),
                    Integer.parseInt(m[17]), Integer.parseInt(m[18]), Integer.parseInt(m[19]),
                    Integer.parseInt(m[20]), Integer.parseInt(m[21]), Integer.parseInt(m[22]),
                    Integer.parseInt(m[23]));
            moviesList.add(movie);
            
            movieId_name.put(Integer.parseInt(m[0]),(m[1]));
        }
		
		File f2 = new File("datasets/ratings.data");
		ArrayList<RatingClass> ratingsList = new ArrayList<RatingClass>();
		 Scanner sc1 = new Scanner(f2);

	// using hashmap to map the userid and ratings
	    
	    Map<Integer,Integer> id_rating=new HashMap<Integer,Integer>();
	    
	    while (sc1.hasNextLine()) {
	        String data = sc1.nextLine();
	        var rat = data.split(" ");
	        RatingClass ratings = new RatingClass(Integer.parseInt(rat[0]), Integer.parseInt(rat[1]),
	                Integer.parseInt(rat[2]), Integer.parseInt(rat[3]));
	        ratingsList.add(ratings); 
	        
	        id_rating.put(Integer.parseInt(rat[0]),Integer.parseInt(rat[2]));
	    
	        }
		
		for(MovieClass m: moviesList)
		{
			if(m.getMovie_id()==mov_id)
			{
				if(m.getIsAction()==1)
					return "Action";
				
				else if(m.getIsAdventure()==1)
					return "Adventure";
				
				else if(m.getIsAnimation()==1)
					return "Animation";
				
				else if(m.getIsChildren()==1)
					return "Children";
				
				else if(m.getIsComedy()==1)
					return "Comedy";
				
				else if(m.getIsCrime()==1)
					return "Crime";
				
				else if(m.getIsDocumentary()==1)
					return "Documentary";
				
				else if(m.getIsDrama()==1)
					return "Drama";
				
				else if(m.getIsFantasy()==1)
					return "Fantasy";
				
				else if(m.getIsFilmNoir()==1)
					return "FilmNoir";
				
				else if(m.getIsHorror()==1)
					return "Horror";
				
				else if(m.getIsMusical()==1)
					return "Musical";
				
				else if(m.getIsMystery()==1)
					return "Mystery";
				
				else if(m.getIsRomance()==1)
					return "Romance";
				
				else if(m.getIsSci()==1)
					return "Sci";
				
				else if(m.getIsThriller()==1)
					return "Thriller";
				
				else if(m.getIsWar()==1)
					return "War";
				
				else if(m.getIsWestern()==1)
					return "Western";
			}
		}
	
	}
	
	
}
