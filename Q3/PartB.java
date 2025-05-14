public ArrayList<Match> buildMatches() {
  ArrayList<Match> result = new ArrayList<Match>();
  int len = competitorList.size();
  if (len % 2 == 0) {
    for (int i = 0; i < len/2; i++) {
      Competitors p1 = competitorList.get(i);
      Competitors p2 = competitorList.get(len-i-1);
      Match m = new Match(p1, p2);
      result.add(m);
    }

  else {
    for (int i = 0; i < len/2; i++) {
      Competitors p1 = competitorList.get(i+1);
      Competitors p2 = competitorList.get(len-i-1);
      Match m = new Match(p1, p2);
      result.add(m);
    }
  }
  return result;
}
