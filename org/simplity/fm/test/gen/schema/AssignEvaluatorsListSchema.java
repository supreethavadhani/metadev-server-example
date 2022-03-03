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
 * class that represents structure of assignEvaluatorsList
 */ 
public class AssignEvaluatorsListSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("offeredSubjectId", 0, DefinedDataTypes.id, null, null, null, "offered_subject_id", ColumnType.PrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("departmentId", 2, DefinedDataTypes.id, null, null, "departmentList", "department_id", ColumnType.RequiredData)
	};
	private static final  boolean[] OPS = {true, false, true, false, false, false};
	private static final String SELECT = "SELECT offered_subject_id, institute_id, department_id FROM assigned_evaluators";
	private static final int[] SELECT_IDX = {0, 1, 2};
	private static final  String INSERT = "INSERT INTO assigned_evaluators(offered_subject_id, institute_id, department_id) values (?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2};
	private static final String WHERE = " WHERE offered_subject_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE assigned_evaluators SET department_id= ?  WHERE offered_subject_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 0, 1};
	private static final String DELETE = "DELETE FROM assigned_evaluators";
	private static final IValidation[] VALIDS = {new DependentListValidation(0, 2, "taughtSubjectList", "offeredSubjectId", null)
	};

	/**
	 *
	 */
	public AssignEvaluatorsListSchema() {
		this.name = "assignEvaluatorsList";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "assigned_evaluators";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(3, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public AssignEvaluatorsListData newSchemaData() {
		return new AssignEvaluatorsListData(this, null);
	}

	@Override
	protected AssignEvaluatorsListData newSchemaData(final Object[] data) {
		return new AssignEvaluatorsListData(this, data);
	}

	@Override
	public AssignEvaluatorsListData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (AssignEvaluatorsListData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public AssignEvaluatorsListData parseKeys(JsonObject json, IServiceContext ctx) {
		return (AssignEvaluatorsListData) super.parseKeys(json, ctx);
	}

	@Override
	public AssignEvaluatorsListDataTable newSchemaDataTable() {
		return new AssignEvaluatorsListDataTable(this, null);
	}

	@Override
	protected AssignEvaluatorsListDataTable newSchemaDataTable(final Object[][] data) {
		return new AssignEvaluatorsListDataTable(this, data);
	}

	@Override
	public AssignEvaluatorsListDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (AssignEvaluatorsListDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
