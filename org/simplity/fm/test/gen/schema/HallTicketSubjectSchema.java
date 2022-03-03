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
 * class that represents structure of hallTicketSubject
 */ 
public class HallTicketSubjectSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("studentId", 0, DefinedDataTypes.id, null, null, null, "student_id", ColumnType.PrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("subjectName", 2, DefinedDataTypes.text, null, null, null, "subject_name", ColumnType.RequiredData), 
			new DbField("subjectCode", 3, DefinedDataTypes.text, null, null, null, "subject_code", ColumnType.RequiredData), 
			new DbField("isEligible", 4, DefinedDataTypes.text, null, null, null, "is_eligible", ColumnType.RequiredData)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT student_id, institute_id, subject_name, subject_code, is_eligible FROM hall_ticket_details";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4};
	private static final  String INSERT = "INSERT INTO hall_ticket_details(student_id, institute_id, subject_name, subject_code, is_eligible) values (?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4};
	private static final String WHERE = " WHERE student_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE hall_ticket_details SET subject_name= ? , subject_code= ? , is_eligible= ?  WHERE student_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 0, 1};
	private static final String DELETE = "DELETE FROM hall_ticket_details";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public HallTicketSubjectSchema() {
		this.name = "hallTicketSubject";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "hall_ticket_details";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(5, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public HallTicketSubjectData newSchemaData() {
		return new HallTicketSubjectData(this, null);
	}

	@Override
	protected HallTicketSubjectData newSchemaData(final Object[] data) {
		return new HallTicketSubjectData(this, data);
	}

	@Override
	public HallTicketSubjectData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (HallTicketSubjectData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public HallTicketSubjectData parseKeys(JsonObject json, IServiceContext ctx) {
		return (HallTicketSubjectData) super.parseKeys(json, ctx);
	}

	@Override
	public HallTicketSubjectDataTable newSchemaDataTable() {
		return new HallTicketSubjectDataTable(this, null);
	}

	@Override
	protected HallTicketSubjectDataTable newSchemaDataTable(final Object[][] data) {
		return new HallTicketSubjectDataTable(this, data);
	}

	@Override
	public HallTicketSubjectDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (HallTicketSubjectDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
