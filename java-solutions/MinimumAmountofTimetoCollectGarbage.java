class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int size = garbage.length;
        String[] paper = new String[size], metal = new String[size], glass = new String[size];
        int metalC = 0, paperC = 0, glassC = 0;

		//Counts total of garbage collected from each house
        for (int i = 0; i < size; i++) {
            String papers = "", metals = "", glasses = "";
            for (Character c : garbage[i].toCharArray()) {
                switch (c) { 
                    case 'G': 
                        glasses += c;
                        glassC ++;
                        break;
                    case 'P':
                        papers += c;
                        paperC++;
                        break;
                    case 'M':
                        metals += c;
                        metalC++;
                        break;
                    default:
                        System.out.println("This shouldn't happen");
                }
            }
            paper[i] = papers;
            metal[i] = metals;
            glass[i] = glasses;
        }
		//As collection takes one minutes, count of each type of garbage can be added to the result
        int result = metalC + glassC + paperC;
        int metalI = 0, paperI = 0, glassI = 0;
		
		//Each truck only needs to travel as far as the last garbage it picks up
        while (metalC != 0) {
			//determines if the truck needs to travel to the next house
            metalC -= metal[metalI].length();
            if (metalC != 0) result += travel[metalI];
            metalI++;
        }

        while (paperC != 0) {
            paperC -= paper[paperI].length();
            if (paperC != 0) result += travel[paperI];
            paperI++;
        }

        while (glassC != 0) {
            glassC -= glass[glassI].length();
            if (glassC != 0) result += travel[glassI];
            glassI++;
        }

        return result;
    }
}
