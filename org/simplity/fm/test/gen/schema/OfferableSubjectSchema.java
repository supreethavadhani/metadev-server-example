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
 * class that represents structure of offerableSubject
 */ 
public class OfferableSubjectSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("instituteId", 0, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("subjectId", 1, DefinedDataTypes.id, null, null, null, "subject_id", ColumnType.PrimaryKey), 
			new DbField("name", 2, DefinedDataTypes.name, null, null, null, "name", ColumnType.OptionalData), 
			new DbField("code", 3, DefinedDataTypes.code, null, null, null, "code", ColumnType.OptionalData), 
			new DbField("departmentName", 4, DefinedDataTypes.name, null, null, null, "department_name", ColumnType.OptionalData), 
			new DbField("offeredSections", 5, DefinedDataTypes.text, null, null, null, "offered_sections", ColumnType.OptionalData)
	};
	private static final  boolean[] OPS = {true, false, false, false, true, false};
	private static final String SELECT = "SELECT institute_id, subject_id, name, code, department_name, offered_sections FROM offerable_subjects";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5};
	private static final  String INSERT = "INSERT INTO offerable_subjects(institute_id, subject_id, name, code, department_name, offered_sections) values (?, ?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5};
	private static final String WHERE = " WHERE subject_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {1, 0};
	private static final  String UPDATE = "UPDATE offerable_subjects SET name= ? , code= ? , department_name= ? , offered_sections= ?  WHERE subject_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 5, 1, 0};
	private static final String DELETE = "DELETE FROM offerable_subjects";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public OfferableSubjectSchema() {
		this.name = "offerableSubject";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "offerable_subjects";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(6, this.fields[0], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public OfferableSubjectData newSchemaData() {
		return new OfferableSubjectData(this, null);
	}

	@Override
	protected OfferableSubjectData newSchemaData(final Object[] data) {
		return new OfferableSubjectData(this, data);
	}

	@Override
	public OfferableSubjectData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (OfferableSubjectData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public OfferableSubjectData parseKeys(JsonObject json, IServiceContext ctx) {
		return (OfferableSubjectData) super.parseKeys(json, ctx);
	}

	@Override
	public OfferableSubjectDataTable newSchemaDataTable() {
		return new OfferableSubjectDataTable(this, null);
	}

	@Override
	protected OfferableSubjectDataTable newSchemaDataTable(final Object[][] data) {
		return new OfferableSubjectDataTable(this, data);
	}

	@Override
	public OfferableSubjectDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (OfferableSubjectDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
