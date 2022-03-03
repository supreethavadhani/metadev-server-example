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
 * class that represents structure of programLevelList
 */ 
public class ProgramLevelListSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("departmentId", 0, DefinedDataTypes.id, null, null, "departmentList", "department_id", ColumnType.RequiredData), 
			new DbField("programId", 1, DefinedDataTypes.id, null, null, null, "program_id", ColumnType.PrimaryKey), 
			new DbField("programLevelId", 2, DefinedDataTypes.id, null, null, null, "level_id", ColumnType.PrimaryKey)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT department_id, program_id, level_id FROM program_levels";
	private static final int[] SELECT_IDX = {0, 1, 2};
	private static final  String INSERT = "INSERT INTO program_levels(department_id, program_id, level_id) values (?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2};
	private static final String WHERE = " WHERE program_id=? AND level_id=?";
	private static final int[] WHERE_IDX = {1, 2};
	private static final  String UPDATE = "UPDATE program_levels SET department_id= ?  WHERE program_id=? AND level_id=?";
	private static final  int[] UPDATE_IDX = {0, 1, 2};
	private static final String DELETE = "DELETE FROM program_levels";
	private static final IValidation[] VALIDS = {new DependentListValidation(1, 0, "programList", "programId", null),
		new DependentListValidation(2, 1, "programLevelList", "programLevelId", null)
	};

	/**
	 *
	 */
	public ProgramLevelListSchema() {
		this.name = "programLevelList";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "program_levels";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(3, null, SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public ProgramLevelListData newSchemaData() {
		return new ProgramLevelListData(this, null);
	}

	@Override
	protected ProgramLevelListData newSchemaData(final Object[] data) {
		return new ProgramLevelListData(this, data);
	}

	@Override
	public ProgramLevelListData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (ProgramLevelListData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public ProgramLevelListData parseKeys(JsonObject json, IServiceContext ctx) {
		return (ProgramLevelListData) super.parseKeys(json, ctx);
	}

	@Override
	public ProgramLevelListDataTable newSchemaDataTable() {
		return new ProgramLevelListDataTable(this, null);
	}

	@Override
	protected ProgramLevelListDataTable newSchemaDataTable(final Object[][] data) {
		return new ProgramLevelListDataTable(this, data);
	}

	@Override
	public ProgramLevelListDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (ProgramLevelListDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
