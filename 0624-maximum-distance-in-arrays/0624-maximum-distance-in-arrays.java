class Solution {
 public int maxDistance(List<List<Integer>> arrays) {
  /*
   * so we have M arrays of N length each
   *
   * M ~ 100,000
   * N ~ 500, but it seems only the first & last elements matter
   *
   * we must consider, for any 2 arrays, the maximum delta between any element
   * from one array and any element from the other
   *
   * (we must be careful to not consider 2 elements from the same array !)
   *
   * the arrays are sorted, so there doesn't seem to be a reason to use the interior
   *
   * so for each array's minimum, we want to consider the largest maximum amongst
   * maxima that aren't in this array
   *
   * I could count up how many of each
   *
   * if I see a count of 2+ for the "other end", I can definitely use it
   *
   * if I see a count of 1, then I must check it's not a 1 contributed by this array
   *
   *
   * so I basically want to use the global minimum & global maximum, but I must possibly
   * use the 2nd-most-minimum & the 2nd-most-maximum
   *
   * and I must consider the count of each
   *
   * ... is that it?  probably not, but ...
   *
   */
  var max = -1;
  var min = -1;
  {
   final var A = arrays.getFirst();

   min = A.getFirst();
   max = A.getLast();
  }

  final var M = arrays.size();

  var result = 0;

  for (var i = 1; i < M; i++) {
   final var A = arrays.get(i);

   final var first = A.getFirst();
   final var last = A.getLast();

   /*
    * contribute these to the result before "including" them into min/max
    */
   result = Math.max(result, last - min);
   result = Math.max(result, max - first);

   min = Math.min(min, first);
   max = Math.max(max, last);

  }

  return result;
 }
}