package objects;

public class MovieClass {
       
	    private int movie_id, Unknown, Action, Adventure, Animation,
	            Children, Comedy, Crime, Documentary, Drama, Fantasy,
	            FilmNoir, Horror, Musical, Mystery, Romance,
	            Scifi, Thriller, War, Western,release_date;
	    private String movie_title, video_release_date, imdb_url;

	    public MovieClass(int movie_id, int Unknown, int Action, int Adventure,
	                  int Animation, int Children, int Comedy, int Crime,
	                  int Documentary, int Drama, int Fantasy, int FilmNoir,
	                  int Horror, int Musical, int Mystery, int Romance, int Scifi,
	                  int Thriller, int War,int Western, String movie_title,
	                  int release_date, String video_release_date, String imdb_url) {
	    	
	        this.movie_id = movie_id; this.Unknown = Unknown; this.Action = Action;
	        this.Adventure = Adventure;this.Animation = Animation;this.Children = Children;
	        this.Comedy = Comedy;this.Crime = Crime; this.Documentary = Documentary;
	        this.Drama = Drama;this.Fantasy = Fantasy; this.FilmNoir = FilmNoir; this.Horror = Horror;
	        this.Musical = Musical; this.Mystery = Mystery;
	        this.Romance = Romance; this.Scifi = Scifi;this.Thriller = Thriller; this.War = War;
	        this.Western = Western; this.movie_title = movie_title;this.release_date = release_date;
	        this.video_release_date = video_release_date;this.imdb_url = imdb_url;
	    }

	    public int getMovie_id() {
	        return movie_id;
	    }

	    public void setMovie_id(int movie_id) {
	        this.movie_id = movie_id;
	    }

	    public int getIsUnknown() {
	        return Unknown;
	    }

	    public void setIsUnknown(int Unknown) {
	        this.Unknown = Unknown;
	    }

	    public int getIsAction() {
	        return Action;
	    }

	    public void setIsAction(int Action) {
	        this.Action = Action;
	    }

	    public int getIsAdventure() {
	        return Adventure;
	    }

	    public void setIsAdventure(int isAdventure) {
	        this.Adventure = isAdventure;
	    }

	    public int getIsAnimation() {
	        return Animation;
	    }

	    public void setIsAnimation(int isAnimation) {
	        this.Animation = Animation;
	    }

	    public int getIsChildren() {
	        return Children;
	    }

	    public void setIsChildren(int isChildren) {
	        this.Children = isChildren;
	    }

	    public int getIsComedy() {
	        return Comedy;
	    }

	    public void setIsComedy(int isComedy) {
	        this.Comedy = Comedy;
	    }

	    public int getIsCrime() {
	        return Crime;
	    }

	    public void setIsCrime(int Crime) {
	        this.Crime = Crime;
	    }

	    public int getIsDocumentary() {
	        return Documentary;
	    }

	    public void setIsDocumentary(int isDocumentary) {
	        this.Documentary = Documentary;
	    }

	    public int getIsDrama() {
	        return Drama;
	    }

	    public void setIsDrama(int isDrama) {
	        this.Drama = Drama;
	    }

	    public int getIsFantasy() {
	        return Fantasy;
	    }

	    public void setIsFantasy(int Fantasy) {
	        this.Fantasy = Fantasy;
	    }

	    public int getIsFilmNoir() {
	        return FilmNoir;
	    }

	    public void setIsFilmNoir(int FilmNoir) {
	        this.FilmNoir = FilmNoir;
	    }

	    public int getIsHorror() {
	        return Horror;
	    }

	    public void setIsHorror(int Horror) {
	        this.Horror = Horror;
	    }

	    public int getIsMusical() {
	        return Musical;
	    }

	    public void setIsMusical(int Musical) {
	        this.Musical = Musical;
	    }

	    public int getIsMystery() {
	        return Mystery;
	    }

	    public void setIsMystery(int Mystery) {
	        this.Mystery = Mystery;
	    }

	    public int getIsRomance() {
	        return Romance;
	    }

	    public void setIsRomance(int Romance) {
	        this.Romance = Romance;
	    }

	    public int getIsSci() {
	        return Scifi;
	    }

	    public void setIsSci(int isSci) {
	        this.Scifi = isSci;
	    }

	    public int getIsThriller() {
	        return Thriller;
	    }

	    public void setIsThriller(int Thriller) {
	        this.Thriller = Thriller;
	    }

	    public int getIsWar() {
	        return War;
	    }

	    public void setIsWar(int isWar) {
	        this.War = War;
	    }

	    public int getIsWestern() {
	        return Western;
	    }

	    public void setIsWestern(int Western) {
	        this.Western = Western;
	    }

	    public String getMovie_title() {
	        return movie_title;
	    }

	    public void setMovie_title(String movie_title) {
	        this.movie_title = movie_title;
	    }

	    public int getRelease_date() {
	        return release_date;
	    }

	    public void setRelease_date(int release_date) {
	        this.release_date = release_date;
	    }

	    public String getVideo_release_date() {
	        return video_release_date;
	    }

	    public void setVideo_release_date(String video_release_date) {
	        this.video_release_date = video_release_date;
	    }

	    public String getImdb_url() {
	        return imdb_url;
	    }

	    public void setImdb_url(String imdb_url) {
	        this.imdb_url = imdb_url;
	    }

}


