package org.gestern.gringotts.currency;

import org.bukkit.inventory.ItemStack;

/**
 * Representation of a denomination within a currency.
 * 
 * @author jast
 *
 */
public class Denomination implements Comparable<Denomination> {
		
	/** Item type of this denomination. */
	public final ItemStack type;
	public final int id;
	public final short damage;
	public final byte data;
	public final long value;
	
	public Denomination(ItemStack type) {
		this(type, 0);
	}
	
	public Denomination(ItemStack type, long value) {
		this.type = type;
		this.id = type.getTypeId();
		this.damage = type.getDurability();
		this.data = type.getData().getData();
		this.value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + damage;
		result = prime * result + data;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Denomination other = (Denomination) obj;
		if (damage != other.damage)
			return false;
		if (data != other.data)
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
    public int compareTo(Denomination other) {
		return Long.valueOf(value).compareTo(other.value);
    }

}
