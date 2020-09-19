import java.util.ArrayList;

public class DeleteToSort {
	private ArrayList<Integer> indices = new ArrayList<Integer>(); 
	private boolean ordered = true;

	public DeleteToSort() {}

	ArrayList<Integer> minDeletionSize(String [] A) {
		indices.clear(); //clears indices in case of multiple function calls

		for (int i = 0; i < A.length-1; i++) {
			if (A[i].length() != A[i+1].length()) { //if the strings are different lengths, return -1
				indices.add(-1);
				return indices;
			}
		}
		
		for (int l = 0; l < A[0].length(); l++) {
			for (int w = 0; w < A.length-1; w++) {
				if (A[w].charAt(l) > A[w+1].charAt(l)) {
					indices.add(l);
					ordered = false;
					break; //once a non-ordered pair is found, skip to the next column
				}
			}
		}

		if (ordered) { //if there is nothing out of order, return empty array
			return new ArrayList<Integer>();
		}

		return indices;
	}

	public static void main(String[] args) {
		String[] A = {"cba", "daf", "ghik"};
		DeleteToSort test = new DeleteToSort();

		System.out.println(test.minDeletionSize(A));
	}
}