package mnj.mfg.view.backing_bean;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.faces.event.ActionEvent;

import javax.servlet.http.HttpSession;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.PopupCanceledEvent;
import oracle.adf.view.rich.event.PopupFetchEvent;

import oracle.adfinternal.view.faces.model.binding.FacesCtrlHierNodeBinding;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
import oracle.jbo.ViewObject;

public class Main {
    private RichInputText customerBuyerID;
    private RichInputListOfValues style;
    private RichTable size1st;
    private RichTable selectAllTable;
    private RichTable size2st;
    private RichTable selectAllTable1;
    private RichInputText headerId;

    public Main() {
        super();
    }
    
    
    
    public void setCustomerIdS(RichInputText id){
        
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession) ectx.getSession(false);
        userSession.setAttribute("CustomerIdS", id.getValue());    
    }

    public void setCustomerBuyerID(RichInputText customerBuyerID) {
        this.customerBuyerID = customerBuyerID;
        setCustomerIdS(customerBuyerID);
    }

    public RichInputText getCustomerBuyerID() {
        return customerBuyerID;
    }

    public void setStyle(RichInputListOfValues style) {
        this.style = style;
    }

    public RichInputListOfValues getStyle() {
        return style;
    }
    
    
    //////////fill bpo////////////////////
    
    
    public void editDialogListShade(DialogEvent dialogEvent) {
            System.out.println("enter editDialogListShade-------------->");
            if (dialogEvent.getOutcome().name().equals("ok")) {


                OperationBinding operationBinding =
                    executeOperation("FillRollLines");
                operationBinding.execute();
                AdfFacesContext.getCurrentInstance().addPartialTarget(size1st);
                
               
            }

        }


        public void editPopupCancelListener(PopupCanceledEvent popupCanceledEvent) {

        }



        public void editPopupFetchListener(PopupFetchEvent popupFetchEvent) {

            OperationBinding operationBinding =
                executeOperation("setRollwhereClause");
            operationBinding.execute();
        }
        
    public OperationBinding executeOperation(String operation) {
        OperationBinding createParam =
            getBindingsCont().getOperationBinding(operation);
        return createParam;

    }
    /*****Generic Method to Get BindingContainer**/
    public BindingContainer getBindingsCont() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }


    public void setSize1st(RichTable size1st) {
        this.size1st = size1st;
    }

    public RichTable getSize1st() {
        return size1st;
    }
    
    ////////////////////select All/////////////
    /////////////////////////
            public void SelectAll1(ActionEvent actionEvent) {
            System.out.println("SelectAll simantaniously");
            // Add event code here...
            OperationBinding operationBinding = executeOperation("selectAllLines1");
            operationBinding.getParamsMap().put("flag", "Y");
            operationBinding.execute();
           AdfFacesContext.getCurrentInstance().addPartialTarget(selectAllTable1);
            System.out.println("selectAllTable1");
        }
        
        public void DeSelectAll1(ActionEvent actionEvent) {
            // Add event code here...
            OperationBinding operationBinding = executeOperation("selectAllLines1");
            operationBinding.getParamsMap().put("flag", "N");
            operationBinding.execute();
       AdfFacesContext.getCurrentInstance().addPartialTarget(selectAllTable1);
        }
        
        /////////////////////
        public void SelectAll(ActionEvent actionEvent) {
            System.out.println("SelectAll");
            // Add event code here...
            OperationBinding operationBinding = executeOperation("selectAllLines");
            operationBinding.getParamsMap().put("flag", "Y");
            operationBinding.execute();
           AdfFacesContext.getCurrentInstance().addPartialTarget(selectAllTable);
            System.out.println("selectAllTable");
        }
        
        public void DeSelectAll(ActionEvent actionEvent) {
            // Add event code here...
            OperationBinding operationBinding = executeOperation("selectAllLines");
            operationBinding.getParamsMap().put("flag", "N");
            operationBinding.execute();
        AdfFacesContext.getCurrentInstance().addPartialTarget(selectAllTable);
        }
        
        ////////////////////////////////////////

    public void setSelectAllTable(RichTable selectAllTable) {
        this.selectAllTable = selectAllTable;
    }

    public RichTable getSelectAllTable() {
        return selectAllTable;
    }
    
    /////////////////fill size///////////
    public void editDialogListShade1(DialogEvent dialogEvent) {
            System.out.println("enter editDialogListShade-------------->");
            if (dialogEvent.getOutcome().name().equals("ok")) {


                OperationBinding operationBinding =
                    executeOperation("FillRollLines1");
                operationBinding.execute();
                AdfFacesContext.getCurrentInstance().addPartialTarget(size2st);
                
               
            }

        }


        public void editPopupCancelListener1(PopupCanceledEvent popupCanceledEvent) {

        }



        public void editPopupFetchListener1(PopupFetchEvent popupFetchEvent) {

//            OperationBinding operationBinding =
//                executeOperation("setRollwhereClause1");
//            operationBinding.execute();
//            if (popupFetchEvent.getLaunchSourceClientId().contains("cbInsert")) {
//                System.out.println("Org ka if");
//                BindingContainer bindings = getBindings();
//                OperationBinding operationBinding1 = 
//                                        bindings.getOperationBinding("CreateInsert");
//                operationBinding1.execute();
//            }
            
            
        DCBindingContainer binding = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding itorBinding = binding.findIteratorBinding("LineVO1Iterator");
        String bpo = null;
        String stn = null;
        String color = null;
        String challan_no = null;
        try
        {
            bpo = itorBinding.getCurrentRow().getAttribute("Attribute1").toString();
        }catch(Exception e){
            ;    
        }
        try
        {
            stn = itorBinding.getCurrentRow().getAttribute("BpoId").toString();
        }catch(Exception e){
            ;    
        }
        try
        {
            color = itorBinding.getCurrentRow().getAttribute("Attribute3").toString();
        }catch(Exception e){
            ;    
        }
           
        System.out.println("bpo "+bpo);
        System.out.println("stn "+stn);
        System.out.println("color "+color);
        
        OperationBinding operationBinding = executeOperation("setSizeWhereClause");
        operationBinding.getParamsMap().put("bpo", bpo);
        operationBinding.getParamsMap().put("stn", stn);
        operationBinding.getParamsMap().put("color",color);
        operationBinding.execute();
    }
    ///////////////////////////////////////////////////////////////
    
    //////////////////////////////////////

    public void setSize2st(RichTable size2st) {
        this.size2st = size2st;
    }

    public RichTable getSize2st() {
        return size2st;
    }

    public void setSelectAllTable1(RichTable selectAllTable1) {
        this.selectAllTable1 = selectAllTable1;
    }

    public RichTable getSelectAllTable1() {
        return selectAllTable1;
    }
    
    ///////////Code To Get Total ***********************
    
         public double getTotalValue() {

             BindingContext bindingContext = BindingContext.getCurrent();
             DCDataControl dc =bindingContext.findDataControl("MainAMDataControl"); //
             ApplicationModule am = dc.getApplicationModule();
             ViewObject findViewObject =am.findViewObject("InsemSizeDVO1");//ImpSaleContractDetailEOView1
             
             RowSetIterator it = findViewObject.createRowSetIterator("tt");
             double val = 0.0, total = 0.0;
             while (it.hasNext()){

                     Row r = it.next();
                     try {
                             val = Double.parseDouble(r.getAttribute("Quantity").toString());
                     }catch (Exception e ){;}
                     
                     total = total + val ;
             } //end of while loop
             it.closeRowSetIterator();
             return total ; 
         } 
    
    /// Code to Set Total
        public void setLineValueTotal(double val) {

            oracle.adf.view.rich.component.UIXTable table = getSize1st();
            // Get the Selected Row key set iterator
            java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
            double ply = 0.0;
            while (selectionIt.hasNext()) {
                Object rowKey = selectionIt.next();
                table.setRowKey(rowKey);
                int index = table.getRowIndex();
                FacesCtrlHierNodeBinding row =
                    (FacesCtrlHierNodeBinding)table.getRowData(index);
                Row selectedRow = row.getRow();


                
                    selectedRow.setAttribute("Quantity",val);
               

            }
            
        }
    /////////////////////////////////////


    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String Save() {
        
        setLineValueTotal (getTotalValue());
        
        AdfFacesContext.getCurrentInstance().addPartialTarget(size1st);
        
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =bindingContext.findDataControl("MainAMDataControl"); //
        ApplicationModule am = dc.getApplicationModule();
        ViewObject findViewObject =am.findViewObject("HeaderVO1");
          
        return null;
    }

    public String RequisitionAccessories() {
        
        BindingContext bctx = BindingContext.getCurrent();
        BindingContainer bindings = bctx.getCurrentBindingsEntry();
        OperationBinding operationBinding =
            bindings.getOperationBinding("callOperationsHeder");
        
        oracle.jbo.domain.Number p_header_id =(oracle.jbo.domain.Number)getHeaderId().getValue();
        // String p_ob_id = (String)getHeaderId().getValue();
        operationBinding.getParamsMap().put("p_header_id", p_header_id);

        //invoke method
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            System.out.println("if errors-->"+operationBinding.getErrors());
            // List errors = operationBinding.getErrors();
        }
        //optional
        Object methodReturnValue = operationBinding.getResult();
        String message = null;
        if (methodReturnValue != null) {
            message = methodReturnValue.toString();
        } else {
            message = "Failed!";
        }
        FacesMessage fm = new FacesMessage(message);
        fm.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, fm);
        return null;
    }

    public void setHeaderId(RichInputText headerId) {
        this.headerId = headerId;
    }

    public RichInputText getHeaderId() {
        return headerId;
    }
}
