package lamda;

import java.util.List;

public class TreeNursery {
    private List<Sapling> saplings;

    public TreeNursery(List<Sapling> trees) {
        this.saplings = trees;
    }

    public List<Sapling> getSaplings() {
        return saplings;
    }

    public void prune(int maxHeight) {
        saplings.forEach(tree -> tree.cut(maxHeight));
    }

    public void sell(String species, int minHeight) {
        saplings.removeIf(tree -> species.equals(tree.getSpecies()) && tree.getHeight() > minHeight);
    }
}
