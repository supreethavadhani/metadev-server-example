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
 * class that represents structure of offeredSubjectList
 */ 
public class OfferedSubjectListSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("offeredSubjectId", 0, DefinedDataTypes.id, null, null, null, "offered_subject_id", ColumnType.GeneratedPrimaryKey), 
			new DbField("name", 1, DefinedDataTypes.name, null, null, null, "name", ColumnType.RequiredData)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT offered_subject_id, name FROM offered_subject_list";
	private static final int[] SELECT_IDX = {0, 1};
	private static final  String INSERT = "INSERT INTO offered_subject_list(name) values (?)";
	private static final int[] INSERT_IDX = {1};
	private static final String WHERE = " WHERE offered_subject_id=?";
	private static final int[] WHERE_IDX = {0};
	private static final  String UPDATE = "UPDATE offered_subject_list SET name= ?  WHERE offered_subject_id=?";
	private static final  int[] UPDATE_IDX = {1, 0};
	private static final String DELETE = "DELETE FROM offered_subject_list";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public OfferedSubjectListSchema() {
		this.name = "offeredSubjectList";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "offered_subject_list";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(2, null, SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, "offered_subject_id", 0, null);
		this.initialize();
	}

	@Override
	public OfferedSubjectListData newSchemaData() {
		return new OfferedSubjectListData(this, null);
	}

	@Override
	protected OfferedSubjectListData newSchemaData(final Object[] data) {
		return new OfferedSubjectListData(this, data);
	}

	@Override
	public OfferedSubjectListData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (OfferedSubjectListData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public OfferedSubjectListData parseKeys(JsonObject json, IServiceContext ctx) {
		return (OfferedSubjectListData) super.parseKeys(json, ctx);
	}

	@Override
	public OfferedSubjectListDataTable newSchemaDataTable() {
		return new OfferedSubjectListDataTable(this, null);
	}

	@Override
	protected OfferedSubjectListDataTable newSchemaDataTable(final Object[][] data) {
		return new OfferedSubjectListDataTable(this, data);
	}

	@Override
	public OfferedSubjectListDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (OfferedSubjectListDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
