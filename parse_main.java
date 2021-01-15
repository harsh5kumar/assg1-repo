package source;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Vector;

import objects.MovieClass;
import objects.RatingClass;
import source.Findgenre;



public class ReadData {
    public static void main(String args[]){
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
        
 //top movie by genre
        
        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter the genre of movie:");

        String gr = sc2.nextLine();

        int prev_rating=0;

        int top = 0;

        if(gr=="Comedy") {
            for(MovieClass m : moviesList){
                if(m.getIsComedy()==1){
                    if(id_rating.get(m.getMovie_id())>prev_rating){
                        prev_rating=id_rating.get(m.getMovie_id());
                        top=id_rating.get(m.getMovie_id());
                    }
                }
            }
        }
        else if(gr=="Crime") {
        	for(MovieClass m : moviesList){
                if(m.getIsCrime()==1){
                    if(id_rating.get(m.getMovie_id())>prev_rating){
                        prev_rating=id_rating.get(m.getMovie_id());
                        top=id_rating.get(m.getMovie_id());
                    }
                }
            }
        }

        else if(gr=="Documentary") {
        	for(MovieClass m : moviesList){
                if(m.getIsDocumentary()==1){
                    if(id_rating.get(m.getMovie_id())>prev_rating){
                        prev_rating=id_rating.get(m.getMovie_id());
                        top=id_rating.get(m.getMovie_id());
                    }
                }
            }
        }

        else if(gr=="Drama") {
        	for(MovieClass m : moviesList){
                if(m.getIsDrama()==1){
                    if(id_rating.get(m.getMovie_id())>prev_rating){
                        prev_rating=id_rating.get(m.getMovie_id());
                        top=id_rating.get(m.getMovie_id());
                    }
                }
            }
        }

        else if(gr=="Fantasy") {
        	for(MovieClass m : moviesList){
                if(m.getIsFantasy()==1){
                    if(id_rating.get(m.getMovie_id())>prev_rating){
                        prev_rating=id_rating.get(m.getMovie_id());
                        top=id_rating.get(m.getMovie_id());
                    }
                }
            }
        }

        else if(gr=="FilmNoir") {
        	for(MovieClass m : moviesList){
                if(m.getIsFilmNoir()==1){
                    if(id_rating.get(m.getMovie_id())>prev_rating){
                        prev_rating=id_rating.get(m.getMovie_id());
                        top=id_rating.get(m.getMovie_id());
                    }
                }
            }
        }

        else if(gr=="Horror") {
        	for(MovieClass m : moviesList){
                if(m.getIsHorror()==1){
                    if(id_rating.get(m.getMovie_id())>prev_rating){
                        prev_rating=id_rating.get(m.getMovie_id());
                        top=id_rating.get(m.getMovie_id());
                    }
                }
            }
        }

        else if(gr=="Musical") {
        	for(MovieClass m : moviesList){
                if(m.getIsMusical()==1){
                    if(id_rating.get(m.getMovie_id())>prev_rating){
                        prev_rating=id_rating.get(m.getMovie_id());
                        top=id_rating.get(m.getMovie_id());
                    }
                }
            }
        }

        else if(gr=="Mystery") {
        	for(MovieClass m : moviesList){
                if(m.getIsMystery()==1){
                    if(id_rating.get(m.getMovie_id())>prev_rating){
                        prev_rating=id_rating.get(m.getMovie_id());
                        top=id_rating.get(m.getMovie_id());
                    }
                }
            }
        }

        else if(gr=="Romance") {
        	for(MovieClass m : moviesList){
                if(m.getIsRomance()==1){
                    if(id_rating.get(m.getMovie_id())>prev_rating){
                        prev_rating=id_rating.get(m.getMovie_id());
                        top=id_rating.get(m.getMovie_id());
                    }
                }
            }
        }

        else if(gr=="Sci") {
        	for(MovieClass m : moviesList){
                if(m.getIsSci()==1){
                    if(id_rating.get(m.getMovie_id())>prev_rating){
                        prev_rating=id_rating.get(m.getMovie_id());
                        top=id_rating.get(m.getMovie_id());
                    }
                }
            }
        }

        else if(gr=="Thriller") {
        	for(MovieClass m : moviesList){
                if(m.getIsThriller()==1){
                    if(id_rating.get(m.getMovie_id())>prev_rating){
                        prev_rating=id_rating.get(m.getMovie_id());
                        top=id_rating.get(m.getMovie_id());
                    }
                }
            }
        }

        else if(gr=="War") {
        	for(MovieClass m : moviesList){
                if(m.getIsWar()==1){
                    if(id_rating.get(m.getMovie_id())>prev_rating){
                        prev_rating=id_rating.get(m.getMovie_id());
                        top=id_rating.get(m.getMovie_id());
                    }
                }
            }
        }

        else if(gr=="Western") {
        	for(MovieClass m : moviesList){
                if(m.getIsWestern()==1){
                    if(id_rating.get(m.getMovie_id())>prev_rating){
                        prev_rating=id_rating.get(m.getMovie_id());
                        top=id_rating.get(m.getMovie_id());
                    }
                }
            }
        }
            
        System.out.println(movieId_name.get(top));
        
        
        
  //top movie by year
        
       
        Scanner sc3= new Scanner(System.in);
        
       System.out.println("enter the year:");
       int yr = sc3.nextInt();
       int pre_rating=0;
       int top_id;
       for(MovieClass m: moviesList)
       {
    	   
    	   if(yr == m.getRelease_date()) {
    		   {
    			   if(id_rating.get(m.getMovie_id())>pre_rating)
    			   {
    				   pre_rating=id_rating.get(m.getMovie_id());
    				   top_id= id_rating.get(m.getMovie_id());
    			   }
    		   }
    	   }
       }
        
       System.out.println(movieId_name.get(top_id));
       
 //most watched movie
       
          Map<Integer,Integer> count_rat= new HashMap<Integer,Integer>();
        		  
       for(RatingClass r:ratingsList)
       {
    	   int key=r.getItem_id();
    	   if(count_rat.containsKey(key))
    	   {
    		   count_rat.put(key,count_rat.get(key)+1);
    	   }
    	   else
    		   count_rat.put(key,1);
       }
       
       int max_count = 0, res = -1; 
       
       for(Entry<Integer, Integer> val : count_rat.entrySet()) 
       { 
           if (max_count < val.getValue()) 
           { 
               res = val.getKey(); 
               max_count = val.getValue(); 
           } 
       }
       System.out.println(movieId_name.get(res)); 
       
  
  //most active user
       
       Map<Integer,Integer> count_user= new HashMap<Integer,Integer>();
       
       for(RatingClass r:ratingsList)
       {
    	   int key=r.getUser_id();
    	   if(count_rat.containsKey(key))
    	   {
    		   count_rat.put(key,count_rat.get(key)+1);
    	   }
    	   else
    		   count_rat.put(key,1);
       }
       
       int max_count1 = 0, res1 = -1; 
       
       for(Entry<Integer, Integer> val : count_rat.entrySet()) 
       { 
           if (max_count1 < val.getValue()) 
           { 
               res1 = val.getKey(); 
               max_count1 = val.getValue(); 
           } 
       }
       System.out.println(res1);
       
   //Recommendation Part::
       
     //sorting of arraylist in basis of rating//
       
       ArrayList<RatingClass> revratingsList = new ArrayList<RatingClass>(); 
       
       revratingsList= ratingsList;
       
       Comparator<RatingClass> titleComparator = (c1, c2) ->Integer.valueOf(c1.getRating()).compareTo(Integer.valueOf(c2.getRating()));
       
       revratingsList.sort(Collections.reverseOrder(titleComparator));
       
    //sorted in descending order//
       
       Scanner sc4=new Scanner(System.in);
       String st= sc4.nextLine();
       
       int mov_id;
       for(Entry<Integer, String> entry: movieId_name.entrySet())
       {
    	   if(entry.getValue()==st)
    	   {
    		   mov_id=entry.getKey();
    		   break;
    	   }
       }
       
       String mov_gr = getGenre(mov_id);
       
       Vector<String> vec = new Vector<String>(5);
       
      
    	  for(MovieClass m:moviesList)
    	  {
    		   
    			  for(RatingClass r:revratingsList)
        		  {
    				  if(mov_gr==getGenre(r.getItem_id()))
    				  {
    					  vec.add(movieId_name.get(r.getItem_id()));
    					  
    				  }
        		  } 
    		  
    	  }
    	  
    	  for (String v : vec)
    	  {
    		  System.out.println(v);
    	  }
    	  
      
       
    
 }
    
}
