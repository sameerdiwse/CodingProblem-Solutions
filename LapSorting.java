import java.util.*;
import java.util.Comparator.*;
import java.util.stream.*;

class LapSorting {
	public static void main(String[] args) {
		List<Laptops> l = Arrays.asList(new Laptops(8000, 8, "black"), new Laptops(7000, 9, "grey"),
				new Laptops(5000, 7, "yellow"));
		System.out.println("Naturally sorted Laptop list according to Laptop Ram : ");
		List<Laptops> ll = l.stream().sorted(Comparator.comparing(Laptops::getLapRam))
				.collect(Collectors.toList());
		// Getting the laptop having maximum ram
		int maxRam = l.stream().max(Comparator.comparing(Laptops::getLapRam)).get().getLapRam();
		System.out.println("this is max ram: "+maxRam);

		for (Laptops lll : ll) {
			System.out.println(lll);
		}

		/*
		 * l.stream().filter(x->x.getLapPrice()>5000).forEach(System.out::println);
		 * List<Laptops> l = new ArrayList<>();
		 * l.add(new Laptops(6000, 4, "White"));
		 * l.add(new Laptops(10000, 5, "Black"));
		 * l.add(new Laptops(4000, 2, "Green"));
		 * Collections.sort(l,new IdComparator());
		 * System.out.println(l);
		 */
	}
}
