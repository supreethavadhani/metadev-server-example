package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.DbField;
import org.simplity.fm.core.data.Schema;
import org.simplity.fm.core.validn.IValidation;
import org.simplity.fm.core.data.DbAssistant;
import org.simplity.fm.core.service.IServiceContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import org.simplity.fm.core.data.ColumnType;
import org.simplity.fm.core.validn.DependentListValidation;
import org.simplity.fm.test.gen.DefinedDataTypes;

/**
 * class that represents structure of selectableTest
 */ 
public class SelectableTestSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("testTypeId", 0, DefinedDataTypes.id, null, null, null, "test_type_id", ColumnType.PrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("name", 2, DefinedDataTypes.name, null, null, null, "name", ColumnType.OptionalData), 
			new DbField("code", 3, DefinedDataTypes.code, null, null, null, "code", ColumnType.OptionalData), 
			new DbField("maxMarks", 4, DefinedDataTypes.integer, null, null, null, "max_marks", ColumnType.OptionalData), 
			new DbField("number", 5, DefinedDataTypes.integer, "1", null, null, "number", ColumnType.OptionalData), 
			new DbField("isSelected", 6, DefinedDataTypes.bool, "false", null, null, "is_selected", ColumnType.OptionalData), 
			new DbField("OkToUnselect", 7, DefinedDataTypes.bool, "false", null, null, "ok_to_unselect", ColumnType.OptionalData)
	};
	private static final  boolean[] OPS = {false, false, false, false, true, true};
	private static final String SELECT = "SELECT test_type_id, institute_id, name, code, max_marks, number, is_selected, ok_to_unselect FROM selectable_tests";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7};
	private static final  String INSERT = "INSERT INTO selectable_tests(test_type_id, institute_id, name, code, max_marks, number, is_selected, ok_to_unselect) values (?, ?, ?, ?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5, 6, 7};
	private static final String WHERE = " WHERE test_type_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE selectable_tests SET name= ? , code= ? , max_marks= ? , number= ? , is_selected= ? , ok_to_unselect= ?  WHERE test_type_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 5, 6, 7, 0, 1};
	private static final String DELETE = "DELETE FROM selectable_tests";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public SelectableTestSchema() {
		this.name = "selectableTest";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "selectable_tests";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(8, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public SelectableTestData newSchemaData() {
		return new SelectableTestData(this, null);
	}

	@Override
	protected SelectableTestData newSchemaData(final Object[] data) {
		return new SelectableTestData(this, data);
	}

	@Override
	public SelectableTestData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (SelectableTestData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public SelectableTestData parseKeys(JsonObject json, IServiceContext ctx) {
		return (SelectableTestData) super.parseKeys(json, ctx);
	}

	@Override
	public SelectableTestDataTable newSchemaDataTable() {
		return new SelectableTestDataTable(this, null);
	}

	@Override
	protected SelectableTestDataTable newSchemaDataTable(final Object[][] data) {
		return new SelectableTestDataTable(this, data);
	}

	@Override
	public SelectableTestDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (SelectableTestDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
