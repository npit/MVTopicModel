package org.madgik.dtos;

public class VisualizationDocumentDto extends AbstractDto {

    private String pubyear;
    private String abstractField;
    private String abstractPmc;
    private String otherAbstractPmc;
    private String doctype;
    private String projectAcronym;
    private String project;
    private String journal;
    private String doiId;
    private String pmcId;
    private String salientTerms;

    public VisualizationDocumentDto() {

    }

    public VisualizationDocumentDto(String id, String pubyear, String abstractField, String abstractPmc, String otherAbstractPmc, String doctype, String projectAcronym,
                                    String project, String journal, String doiId, String pmcId, String salientTerms) {
        this.id = id;
        this.pubyear = pubyear;
        this.abstractField = abstractField;
        this.abstractPmc = abstractPmc;
        this.otherAbstractPmc = otherAbstractPmc;
        this.doctype = doctype;
        this.projectAcronym = projectAcronym;
        this.project = project;
        this.journal = journal;
        this.doiId = doiId;
        this.pmcId = pmcId;
        this.salientTerms = salientTerms;
    }

    public VisualizationDocumentDto(String pubyear, String abstractField, String abstractPmc, String otherAbstractPmc, String doctype, String projectAcronym,
                                    String project, String journal, String doiId, String pmcId, String salientTerms) {
        this.pubyear = pubyear;
        this.abstractField = abstractField;
        this.abstractPmc = abstractPmc;
        this.otherAbstractPmc = otherAbstractPmc;
        this.doctype = doctype;
        this.projectAcronym = projectAcronym;
        this.project = project;
        this.journal = journal;
        this.doiId = doiId;
        this.pmcId = pmcId;
        this.salientTerms = salientTerms;
    }

    public String getPubyear() {
        return pubyear;
    }

    public void setPubyear(String pubyear) {
        this.pubyear = pubyear;
    }

    public String getAbstractField() {
        return abstractField;
    }

    public void setAbstractField(String abstractField) {
        this.abstractField = abstractField;
    }

    public String getAbstractPmc() {
        return abstractPmc;
    }

    public void setAbstractPmc(String abstractPmc) {
        this.abstractPmc = abstractPmc;
    }

    public String getOtherAbstractPmc() {
        return otherAbstractPmc;
    }

    public void setOtherAbstractPmc(String otherAbstractPmc) {
        this.otherAbstractPmc = otherAbstractPmc;
    }

    public String getDoctype() {
        return doctype;
    }

    public void setDoctype(String doctype) {
        this.doctype = doctype;
    }

    public String getProjectAcronym() {
        return projectAcronym;
    }

    public void setProjectAcronym(String projectAcronym) {
        this.projectAcronym = projectAcronym;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public String getDoiId() {
        return doiId;
    }

    public void setDoiId(String doiId) {
        this.doiId = doiId;
    }

    public String getPmcId() {
        return pmcId;
    }

    public void setPmcId(String pmcId) {
        this.pmcId = pmcId;
    }

    public String getSalientTerms() {
        return salientTerms;
    }

    public void setSalientTerms(String salientTerms) {
        this.salientTerms = salientTerms;
    }

    @Override
    public String toString() {
        return "VisualizationDocumentDto{" +
                "pubyear='" + pubyear + '\'' +
                ", abstractField='" + abstractField + '\'' +
                ", abstractPmc='" + abstractPmc + '\'' +
                ", otherAbstractPmc='" + otherAbstractPmc + '\'' +
                ", doctype='" + doctype + '\'' +
                ", projectAcronym='" + projectAcronym + '\'' +
                ", project='" + project + '\'' +
                ", journal='" + journal + '\'' +
                ", doiId='" + doiId + '\'' +
                ", pmcId='" + pmcId + '\'' +
                ", salientTerms='" + salientTerms + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}