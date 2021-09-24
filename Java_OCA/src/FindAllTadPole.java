/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OCA;

/**
 *
 * @author Conrad
 */
import java.util.ArrayList;
import java.util.List;

interface CanSwim {
}

class Amphibian implements CanSwim {
}

class Tadpole extends Amphibian {
}

public class FindAllTadPole {
    public static void main(String[] args) {
        List<Tadpole> tadpoles = new ArrayList<Tadpole>();
        for (Amphibian amphibian : tadpoles) {
             CanSwim tadpole = amphibian;
        }
    }
}

/*
Statement.ln15 - " CanSwim tadpole = amphibian; ",
    can be " CanSwim / Amphibian / Object " to run.
*/