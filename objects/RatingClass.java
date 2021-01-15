package objects;

public class RatingClass {
    private int user_id;
    private int item_id;
    private int rating;
    private int timestamp;

    public RatingClass(int user_id, int item_id, int rating, int timestamp) {
        this.user_id = user_id;
        this.item_id = item_id;
        this.rating = rating;
        this.timestamp = timestamp;
    }

   
    public int getUser_id() {
    	return user_id; 
    	}
    public void setUser_id(int user_id) { 
    	this.user_id = user_id;
    	}

    
    public int getItem_id() {
    	return item_id; 
    	}
    public void setItem_id(int item_id) { 
    	this.item_id = item_id;
    	}

    
    public int getRating() { 
    	return rating;
    	}
    public void setRating(int rating) { 
    	this.rating = rating;
    	}

    
    public int getTimestamp() {
    	return timestamp; 
    	}
    public void setTimestamp(int timestamp) {
    	this.timestamp = timestamp;
    	}
}
