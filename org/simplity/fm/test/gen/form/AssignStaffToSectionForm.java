package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.ComponentProvider;
import org.simplity.fm.core.data.Form;
import org.simplity.fm.core.data.Field;
import org.simplity.fm.core.data.LinkedForm;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.SchemaData;
import org.simplity.fm.core.data.SchemaDataTable;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import org.simplity.fm.core.service.IServiceContext;
import org.simplity.fm.test.gen.DefinedDataTypes;
import org.simplity.fm.test.gen.schema.SubjectSectionDetailData;
import org.simplity.fm.test.gen.schema.SubjectSectionDetailDataTable;
/** class for form assignStaffToSection  */
public class AssignStaffToSectionForm extends Form {
	protected static final String NAME = "assignStaffToSection";
	protected static final String SCHEMA = "subjectSectionDetail";
	protected static final  boolean[] OPS = {true, false, true, false, false, false};
	protected static final LinkedForm[] LINKED_FORMS = {
			new LinkedForm("staffs", "assignableStaff", 1, 10000, null,null ,null, true)};
/** constructor */
public AssignStaffToSectionForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
		this.linkedForms = LINKED_FORMS;
		this.initialize();
	}

	@Override
	public AssignStaffToSectionFd newFormData() {
		return new AssignStaffToSectionFd(this, null, null, null);
	}

	@Override
	public AssignStaffToSectionFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (AssignStaffToSectionFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public AssignStaffToSectionFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (AssignStaffToSectionFd)super.parseKeys(json, ctx);
	}

	@Override
	public AssignStaffToSectionFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (AssignStaffToSectionFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public AssignStaffToSectionFdt newFormDataTable() {
		return new AssignStaffToSectionFdt(this, null, null, null);
	}

	@Override
	public AssignStaffToSectionFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new AssignStaffToSectionFd(this, (SubjectSectionDetailData) schemaData, values, data);
	}

	@Override
	public AssignStaffToSectionFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new AssignStaffToSectionFdt(this, (SubjectSectionDetailDataTable) table, values, linkedData);
	}
}
