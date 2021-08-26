package lk.sliit.hotel.dao.inventory;

import lk.sliit.hotel.entity.inventory.ItemType;
import org.springframework.data.repository.CrudRepository;

public interface ItemTypeDAO extends CrudRepository<ItemType,Integer> {
    ItemType findTopByOrderByIdDesc();
}
