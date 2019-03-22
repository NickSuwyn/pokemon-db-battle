import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class App {
	
	private static List<Pokemon> pokemon = new ArrayList<Pokemon>();
	
	public static void main(String[] args) {
		Connection connection = DBConnection.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("select p.name, pi.nickname, t1.name, t2.name, pi.level, p.base_hp, pi.hp_mod, p.base_atk, pi.atk_mod, p.base_def, pi.def_mod, p.base_spc_atk, pi.spc_atk_mod, p.base_spc_def, pi.spc_def_mod, p.base_speed, pi.speed_mod FROM pokemon p inner join pokemon_instance pi on pi.pokemon_id = p.id inner join type t1 on p.type1_id = t1.id left join type t2 on p.type2_id = t2.id");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				pokemon.add(new Pokemon(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10),
						rs.getInt(11), rs.getInt(12), rs.getInt(13), rs.getInt(14), rs.getInt(15),
						rs.getInt(16), rs.getInt(17)));
			}
			pokemon.get(1).setHp(2000);
			for (Pokemon p : pokemon) {
				System.out.println(p.toString());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Battle.doBattle(pokemon.get(0), pokemon.get(1));
	}

}
