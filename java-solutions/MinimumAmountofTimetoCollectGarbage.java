class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int size = garbage.length;
        String[] paper = new String[size], metal = new String[size], glass = new String[size];
        int metalC = 0, paperC = 0, glassC = 0;

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
            System.out.println(papers + " : " + glasses + " : " + metals);
        }

        int result = metalC + glassC + paperC;
        int metalI = 0, paperI = 0, glassI = 0;
        while (metalC != 0) {
            for (Character c : metal[metalI].toCharArray()) {
                metalC--;
            }
            if (metalC != 0) result += travel[metalI];
            metalI++;
        }

        while (paperC != 0) {
            for (Character c : paper[paperI].toCharArray()) {
                paperC--;
            }
            if (paperC != 0) result += travel[paperI];
            paperI++;
        }

        while (glassC != 0) {
            for (Character c : glass[glassI].toCharArray()) {
                glassC--;
            }
            if (glassC != 0) result += travel[glassI];
            glassI++;
        }

        return result;
    }
}
