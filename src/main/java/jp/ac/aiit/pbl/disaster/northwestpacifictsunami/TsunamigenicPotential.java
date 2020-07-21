package jp.ac.aiit.pbl.disaster.northwestpacifictsunami;

import java.util.Arrays;

/**
 * Enumeration for TsunamigenicPotential.
 */
public enum TsunamigenicPotential {
    x0(0,"THERE IS NO POSSIBILITY OF A TSUNAMI"),
    x1(1,"THERE IS A POSSIBILITY OF A DESTRUCTIVE OCEAN-WIDE TSUNAMI"),
    x2(2,"THERE IS A POSSIBILITY OF A DESTRUCTIVE REGIONAL TSUNAMI"),
    x3(3,"THERE IS A POSSIBILITY OF A DESTRUCTIVE LOCAL TSUNAMI NEAR THE EPICENTER"),
    x4(4,"THERE IS A VERY SMALL POSSIBILITY OF A DESTRUCTIVE LOCAL TSUNAMI"),
    x5(5,"undefined code"),
    x6(6,"undefined code"),
    x7(7,"その他の津波発生の可能性有無");

    private int id;
    private String tsunamigenicPotential;

    TsunamigenicPotential(int id, String tsunamigenicPotential) {
        this.id = id;
        this.tsunamigenicPotential = tsunamigenicPotential;
    }

    public Integer getId(){
        return this.id;
    }

    public static TsunamigenicPotential getById(int id) {
        return Arrays.stream(TsunamigenicPotential.values())
                .filter(data -> data.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
