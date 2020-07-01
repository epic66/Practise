package combinationlock;
	/**
	   A class to simulate a combination lock.
	*/
	public class ComboLock
	{
	   private int secret1;
	   private int secret2;
	   private int secret3;
	   // 0: nothing entered, 1: secret1 done, 2: secret2 done, 
	   // 3: secret3 done and unlocked
	   private int lockState;
	   private int currentNumber;
	   private boolean validSoFar = true;
	   /**
	      Initializes the combination of the lock.
	      @param secret1 first number to turn right to
	      @param secret2 second number to turn left to
	      @param secret3 third number to turn right to
	   */
//	   public ComboLock() {
//		   secret1 = 0;
//		   secret2 = 0;
//		   secret3 = 0;
//	   }
	   public ComboLock(int secret1,int secret2, int secret3)
	   {
		   this.secret1 = secret1;
		   this.secret2 = secret2;
		   this.secret3 = secret3;
	   }
	/**
	      Resets the state of the lock so that it can be opened again.
	   */
	   public void reset()
	   {
		   lockState = 0;
		   currentNumber = 0;
		   validSoFar = true;
	   }
	   /**
	      Turns lock left given number of ticks.
	      @param ticks number of ticks to turn left
	   */
	   public void turnLeft(int ticks)
	   {	   
			   currentNumber = (currentNumber + (40-ticks))%40;
			   if(currentNumber == secret2 && lockState == 1) {
				   lockState++;
			   }
			   else {
				   validSoFar = false;
			   }
	   }
	   /**
	      Turns lock right given number of ticks
	      @param ticks number of ticks to turn right
	   */
	   public void turnRight(int ticks)
	   {
		   currentNumber = (currentNumber + ticks);
		   if((lockState == 0 && currentNumber == secret1)||(lockState == 2 && currentNumber == secret3)) {
			   lockState++;
	       }else {
	    	   validSoFar = false;
	       }
	   }
	   /**
	      Returns true if the lock can be opened now
	      @return true if lock is in open state
	   */
	   public boolean open()
	   {
		   if(lockState == 3 && validSoFar == true) {
			   return true;
		   }
		   else {
			   return false;
		   }			   
	   }

	public int getSecret1() {
		return secret1;
	}
	public void setSecret1(int secret1) {
		this.secret1 = secret1;
	}
	public int getSecret2() {
		return secret2;
	}
	public void setSecret2(int secret2) {
		this.secret2 = secret2;
	}
	public int getSecret3() {
		return secret3;
	}
	public void setSecret3(int secret3) {
		this.secret3 = secret3;
	}
	public int getLockState() {
		return lockState;
	}
	public void setLockState(int lockState) {
		this.lockState = lockState;
	}
	public int getCurrentNumber() {
		return currentNumber;
	}
	public void setCurrentNumber(int currentNumber) {
		this.currentNumber = currentNumber;
	}
	public boolean isValidSoFar() {
		return validSoFar;
	}
	public void setValidSoFar(boolean validSoFar) {
		this.validSoFar = validSoFar;
	}
	}


	
	
//	   else {
//	   if(currentNumber - ticks > 0) {
//		   setValidSoFar(true);
//	   }
//	   else {
//		   if(lockState == 2) {
//			   currentNumber = currentNumber+(40-ticks);
//			   setValidSoFar(false);
//		       if(currentNumber == secret3) {
//		     	   lockState++;
//			       setValidSoFar(true);
//		       }
//	       }
//	   }
//}

