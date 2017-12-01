package BookSort;

class BookFlibusta extends Book {

	String ID2;

	public BookFlibusta(String n, String p, String i,String i2) {
            super(n, p, i); 
            this.ID2 = i2;
	}
        
        @Override
        public boolean equals(Object obj) {
           return false;
        }
        
       
}

