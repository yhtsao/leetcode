A 3 x 3 magic square is a 3 x 3 grid filled with distinct numbers from 1 to 9 such that each row, column, and both diagonals all have the same sum.

Given an grid of integers, how many 3 x 3 "magic square" subgrids are there?  (Each subgrid is contiguous).

 

Example 1:

Input:  <br>
 [`[4,3,8,4]`,<br>
  `[9,5,1,9]`,<br>
  `[2,7,6,2]`]<br><br>
Output: 1  <br>
Explanation:  <br>
The following subgrid is a 3 x 3 magic square:   <br>
438 <br>
951 <br>
276 <br>

while this one is not: <br>
384   <br>
519   <br>
762   <br>

In total, there is only one magic square inside the given grid.