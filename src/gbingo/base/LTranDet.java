/**
 * @author Michael Cuison 2021.06.22
 */

package gbingo.base;

public interface LTranDet {
    void MasterRetreive(int fnIndex, Object foValue);
    void DetailRetreive(int fnRow, int fnIndex, Object foValue);
}
