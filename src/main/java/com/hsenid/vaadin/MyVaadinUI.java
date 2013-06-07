package com.hsenid.vaadin;

import com.vaadin.server.ClientConnector;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;

@SuppressWarnings("serial")
public class MyVaadinUI extends UI
{

    private VerticalLayout layout = new VerticalLayout();
    private FormLayout form = new FormLayout();
    private Label label=new Label("Employee Details") ;

    @Override
    protected void init(VaadinRequest request) {

        initLayout();

    }
    private void initLayout() {

        layout.setMargin(true);
        setContent(layout);

       form.setCaption("Employee Details ");

        layout.addComponent(form);



        Label Name = new Label(" Name : ");
        form.addComponent(Name);

        TextField Name_enter = new TextField();
        form.addComponent(Name_enter);

        Label Address = new Label("Address : ");
        form.addComponent(Address);

        TextField Address_enter = new TextField();
        form.addComponent(Address_enter);

        Label Age = new Label("Age : ");
        form.addComponent(Age);

        TextField Age_enter = new TextField();
        form.addComponent(Age_enter);

        Label Nic = new Label("NIC No : ");
        form.addComponent(Nic);

        TextField NIC_enter = new TextField();
        form.addComponent(NIC_enter);

        Label email = new Label("E-mail : ");
        form.addComponent(email);

        TextField emai_Enter = new TextField();
        form.addComponent(emai_Enter);

        Label Mobile = new Label("Mobile No : ");
        form.addComponent(Mobile);

        TextField Mobile_enter = new TextField();
        form.addComponent(Mobile_enter);

        Button button = new Button("Ok");
        button.addClickListener(new Button.ClickListener() {
            public void buttonClick(ClickEvent event) {


                Label message=new Label("You are Registered") ;
                layout.addComponent(message);


            }
        });
        form.addComponent(button);



    }




}