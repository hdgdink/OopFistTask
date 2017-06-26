package logic;

import comparator.EquipComparator;
import substance.biker.Biker;
import substance.equipment.Equip;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 17.06.2017.
 */
public class Operation {

    public static ArrayList<Equip> getEquipsByPriceGap(Biker biker, double minPrice, double maxPrice) {
        ArrayList<Equip> filteredEquips = new ArrayList<Equip>();
        for (Equip equip : biker.getEquipList()) {
            if (equip.getPrice() <= maxPrice && equip.getPrice() >= minPrice) {
                filteredEquips.add(equip);
                System.out.println(equip);
            }
        }
        return filteredEquips;
    }

    public static List<Equip> sortAmmunitionByWeight(List<Equip> equipList) {
        equipList.sort(new EquipComparator());
        for (int i = 0; i < equipList.size(); i++) {
            System.out.println(equipList.get(i));
        }
        return equipList;
    }
}


