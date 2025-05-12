public int dogWalkShift(int startHour, int endHour) {
  int result = 0;
 
  for (int i = startHour; i <= endHour; i++) {
    int dogWalked = walkDogs(i);
    if (i >= 9 && i <= 17 || dogWalked == maxDogs) {
      result++;

    }
    result += dogs * 5;

  }

  return result;


}
