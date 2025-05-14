public int walkDogs(int hour) {
  int numDogs = company.numAvailableDogs(hour);
  if (numDogs >= maxDogs) {
    return maxDogs;
  } 

  return numDogs;


}
