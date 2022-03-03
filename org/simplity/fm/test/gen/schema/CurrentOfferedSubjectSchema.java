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
 * class that represents structure of currentOfferedSubject
 */ 
public class CurrentOfferedSubjectSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("offeredSubjectId", 0, DefinedDataTypes.id, null, null, null, "offered_subject_id", ColumnType.RequiredData), 
			new DbField("subjectId", 1, DefinedDataTypes.id, null, null, null, "subject_id", ColumnType.PrimaryKey)
	};
	private static final  boolean[] OPS = {true, false, false, false, true, false};
	private static final String SELECT = "SELECT offered_subject_id, subject_id FROM current_offered_subjects";
	private static final int[] SELECT_IDX = {0, 1};
	private static final  String INSERT = "INSERT INTO current_offered_subjects(offered_subject_id, subject_id) values (?, ?)";
	private static final int[] INSERT_IDX = {0, 1};
	private static final String WHERE = " WHERE subject_id=?";
	private static final int[] WHERE_IDX = {1};
	private static final  String UPDATE = "UPDATE current_offered_subjects SET offered_subject_id= ?  WHERE subject_id=?";
	private static final  int[] UPDATE_IDX = {0, 1};
	private static final String DELETE = "DELETE FROM current_offered_subjects";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public CurrentOfferedSubjectSchema() {
		this.name = "currentOfferedSubject";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "current_offered_subjects";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(2, null, SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public CurrentOfferedSubjectData newSchemaData() {
		return new CurrentOfferedSubjectData(this, null);
	}

	@Override
	protected CurrentOfferedSubjectData newSchemaData(final Object[] data) {
		return new CurrentOfferedSubjectData(this, data);
	}

	@Override
	public CurrentOfferedSubjectData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (CurrentOfferedSubjectData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public CurrentOfferedSubjectData parseKeys(JsonObject json, IServiceContext ctx) {
		return (CurrentOfferedSubjectData) super.parseKeys(json, ctx);
	}

	@Override
	public CurrentOfferedSubjectDataTable newSchemaDataTable() {
		return new CurrentOfferedSubjectDataTable(this, null);
	}

	@Override
	protected CurrentOfferedSubjectDataTable newSchemaDataTable(final Object[][] data) {
		return new CurrentOfferedSubjectDataTable(this, data);
	}

	@Override
	public CurrentOfferedSubjectDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (CurrentOfferedSubjectDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
