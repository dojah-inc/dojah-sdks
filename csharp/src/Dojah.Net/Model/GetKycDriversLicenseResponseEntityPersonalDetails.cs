/*
 * DOJAH Publilc APIs
 *
 * Use Dojah to verify, onboard and manage user identity across Africa!
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://konfigthis.com
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Dojah.Net.Client.OpenAPIDateConverter;

namespace Dojah.Net.Model
{
    /// <summary>
    /// GetKycDriversLicenseResponseEntityPersonalDetails
    /// </summary>
    [DataContract(Name = "GetKycDriversLicenseResponse_entity_personal_details")]
    public partial class GetKycDriversLicenseResponseEntityPersonalDetails : IEquatable<GetKycDriversLicenseResponseEntityPersonalDetails>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GetKycDriversLicenseResponseEntityPersonalDetails" /> class.
        /// </summary>
        /// <param name="birthDate">birthDate.</param>
        /// <param name="bloodGroupId">bloodGroupId.</param>
        /// <param name="country">country.</param>
        /// <param name="disabilityReason">disabilityReason.</param>
        /// <param name="facialMark">facialMark.</param>
        /// <param name="firstname">firstname.</param>
        /// <param name="gender">gender.</param>
        /// <param name="glasses">glasses.</param>
        /// <param name="height">height.</param>
        /// <param name="isDisability">isDisability.</param>
        /// <param name="lga">lga.</param>
        /// <param name="motherMaidenName">motherMaidenName.</param>
        /// <param name="ninNumber">ninNumber.</param>
        /// <param name="othername">othername.</param>
        /// <param name="state">state.</param>
        /// <param name="surname">surname.</param>
        /// <param name="universaltaxIdentityNumber">universaltaxIdentityNumber.</param>
        public GetKycDriversLicenseResponseEntityPersonalDetails(string birthDate = default(string), string bloodGroupId = default(string), string country = default(string), string disabilityReason = default(string), string facialMark = default(string), string firstname = default(string), string gender = default(string), string glasses = default(string), string height = default(string), string isDisability = default(string), string lga = default(string), string motherMaidenName = default(string), string ninNumber = default(string), string othername = default(string), string state = default(string), string surname = default(string), string universaltaxIdentityNumber = default(string))
        {
            this.BirthDate = birthDate;
            this.BloodGroupId = bloodGroupId;
            this.Country = country;
            this.DisabilityReason = disabilityReason;
            this.FacialMark = facialMark;
            this.Firstname = firstname;
            this.Gender = gender;
            this.Glasses = glasses;
            this.Height = height;
            this.IsDisability = isDisability;
            this.Lga = lga;
            this.MotherMaidenName = motherMaidenName;
            this.NinNumber = ninNumber;
            this.Othername = othername;
            this.State = state;
            this.Surname = surname;
            this.UniversaltaxIdentityNumber = universaltaxIdentityNumber;
        }

        /// <summary>
        /// Gets or Sets BirthDate
        /// </summary>
        [DataMember(Name = "birth_date", EmitDefaultValue = false)]
        public string BirthDate { get; set; }

        /// <summary>
        /// Gets or Sets BloodGroupId
        /// </summary>
        [DataMember(Name = "blood_group_id", EmitDefaultValue = false)]
        public string BloodGroupId { get; set; }

        /// <summary>
        /// Gets or Sets Country
        /// </summary>
        [DataMember(Name = "country", EmitDefaultValue = false)]
        public string Country { get; set; }

        /// <summary>
        /// Gets or Sets DisabilityReason
        /// </summary>
        [DataMember(Name = "disability_reason", EmitDefaultValue = false)]
        public string DisabilityReason { get; set; }

        /// <summary>
        /// Gets or Sets FacialMark
        /// </summary>
        [DataMember(Name = "facial_mark", EmitDefaultValue = false)]
        public string FacialMark { get; set; }

        /// <summary>
        /// Gets or Sets Firstname
        /// </summary>
        [DataMember(Name = "firstname", EmitDefaultValue = false)]
        public string Firstname { get; set; }

        /// <summary>
        /// Gets or Sets Gender
        /// </summary>
        [DataMember(Name = "gender", EmitDefaultValue = false)]
        public string Gender { get; set; }

        /// <summary>
        /// Gets or Sets Glasses
        /// </summary>
        [DataMember(Name = "glasses", EmitDefaultValue = false)]
        public string Glasses { get; set; }

        /// <summary>
        /// Gets or Sets Height
        /// </summary>
        [DataMember(Name = "height", EmitDefaultValue = false)]
        public string Height { get; set; }

        /// <summary>
        /// Gets or Sets IsDisability
        /// </summary>
        [DataMember(Name = "is_disability", EmitDefaultValue = false)]
        public string IsDisability { get; set; }

        /// <summary>
        /// Gets or Sets Lga
        /// </summary>
        [DataMember(Name = "lga", EmitDefaultValue = false)]
        public string Lga { get; set; }

        /// <summary>
        /// Gets or Sets MotherMaidenName
        /// </summary>
        [DataMember(Name = "mother_maiden_name", EmitDefaultValue = false)]
        public string MotherMaidenName { get; set; }

        /// <summary>
        /// Gets or Sets NinNumber
        /// </summary>
        [DataMember(Name = "nin_number", EmitDefaultValue = false)]
        public string NinNumber { get; set; }

        /// <summary>
        /// Gets or Sets Othername
        /// </summary>
        [DataMember(Name = "othername", EmitDefaultValue = false)]
        public string Othername { get; set; }

        /// <summary>
        /// Gets or Sets State
        /// </summary>
        [DataMember(Name = "state", EmitDefaultValue = false)]
        public string State { get; set; }

        /// <summary>
        /// Gets or Sets Surname
        /// </summary>
        [DataMember(Name = "surname", EmitDefaultValue = false)]
        public string Surname { get; set; }

        /// <summary>
        /// Gets or Sets UniversaltaxIdentityNumber
        /// </summary>
        [DataMember(Name = "universaltax_identity_number", EmitDefaultValue = false)]
        public string UniversaltaxIdentityNumber { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GetKycDriversLicenseResponseEntityPersonalDetails {\n");
            sb.Append("  BirthDate: ").Append(BirthDate).Append("\n");
            sb.Append("  BloodGroupId: ").Append(BloodGroupId).Append("\n");
            sb.Append("  Country: ").Append(Country).Append("\n");
            sb.Append("  DisabilityReason: ").Append(DisabilityReason).Append("\n");
            sb.Append("  FacialMark: ").Append(FacialMark).Append("\n");
            sb.Append("  Firstname: ").Append(Firstname).Append("\n");
            sb.Append("  Gender: ").Append(Gender).Append("\n");
            sb.Append("  Glasses: ").Append(Glasses).Append("\n");
            sb.Append("  Height: ").Append(Height).Append("\n");
            sb.Append("  IsDisability: ").Append(IsDisability).Append("\n");
            sb.Append("  Lga: ").Append(Lga).Append("\n");
            sb.Append("  MotherMaidenName: ").Append(MotherMaidenName).Append("\n");
            sb.Append("  NinNumber: ").Append(NinNumber).Append("\n");
            sb.Append("  Othername: ").Append(Othername).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
            sb.Append("  Surname: ").Append(Surname).Append("\n");
            sb.Append("  UniversaltaxIdentityNumber: ").Append(UniversaltaxIdentityNumber).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as GetKycDriversLicenseResponseEntityPersonalDetails);
        }

        /// <summary>
        /// Returns true if GetKycDriversLicenseResponseEntityPersonalDetails instances are equal
        /// </summary>
        /// <param name="input">Instance of GetKycDriversLicenseResponseEntityPersonalDetails to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GetKycDriversLicenseResponseEntityPersonalDetails input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.BirthDate == input.BirthDate ||
                    (this.BirthDate != null &&
                    this.BirthDate.Equals(input.BirthDate))
                ) && 
                (
                    this.BloodGroupId == input.BloodGroupId ||
                    (this.BloodGroupId != null &&
                    this.BloodGroupId.Equals(input.BloodGroupId))
                ) && 
                (
                    this.Country == input.Country ||
                    (this.Country != null &&
                    this.Country.Equals(input.Country))
                ) && 
                (
                    this.DisabilityReason == input.DisabilityReason ||
                    (this.DisabilityReason != null &&
                    this.DisabilityReason.Equals(input.DisabilityReason))
                ) && 
                (
                    this.FacialMark == input.FacialMark ||
                    (this.FacialMark != null &&
                    this.FacialMark.Equals(input.FacialMark))
                ) && 
                (
                    this.Firstname == input.Firstname ||
                    (this.Firstname != null &&
                    this.Firstname.Equals(input.Firstname))
                ) && 
                (
                    this.Gender == input.Gender ||
                    (this.Gender != null &&
                    this.Gender.Equals(input.Gender))
                ) && 
                (
                    this.Glasses == input.Glasses ||
                    (this.Glasses != null &&
                    this.Glasses.Equals(input.Glasses))
                ) && 
                (
                    this.Height == input.Height ||
                    (this.Height != null &&
                    this.Height.Equals(input.Height))
                ) && 
                (
                    this.IsDisability == input.IsDisability ||
                    (this.IsDisability != null &&
                    this.IsDisability.Equals(input.IsDisability))
                ) && 
                (
                    this.Lga == input.Lga ||
                    (this.Lga != null &&
                    this.Lga.Equals(input.Lga))
                ) && 
                (
                    this.MotherMaidenName == input.MotherMaidenName ||
                    (this.MotherMaidenName != null &&
                    this.MotherMaidenName.Equals(input.MotherMaidenName))
                ) && 
                (
                    this.NinNumber == input.NinNumber ||
                    (this.NinNumber != null &&
                    this.NinNumber.Equals(input.NinNumber))
                ) && 
                (
                    this.Othername == input.Othername ||
                    (this.Othername != null &&
                    this.Othername.Equals(input.Othername))
                ) && 
                (
                    this.State == input.State ||
                    (this.State != null &&
                    this.State.Equals(input.State))
                ) && 
                (
                    this.Surname == input.Surname ||
                    (this.Surname != null &&
                    this.Surname.Equals(input.Surname))
                ) && 
                (
                    this.UniversaltaxIdentityNumber == input.UniversaltaxIdentityNumber ||
                    (this.UniversaltaxIdentityNumber != null &&
                    this.UniversaltaxIdentityNumber.Equals(input.UniversaltaxIdentityNumber))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.BirthDate != null)
                {
                    hashCode = (hashCode * 59) + this.BirthDate.GetHashCode();
                }
                if (this.BloodGroupId != null)
                {
                    hashCode = (hashCode * 59) + this.BloodGroupId.GetHashCode();
                }
                if (this.Country != null)
                {
                    hashCode = (hashCode * 59) + this.Country.GetHashCode();
                }
                if (this.DisabilityReason != null)
                {
                    hashCode = (hashCode * 59) + this.DisabilityReason.GetHashCode();
                }
                if (this.FacialMark != null)
                {
                    hashCode = (hashCode * 59) + this.FacialMark.GetHashCode();
                }
                if (this.Firstname != null)
                {
                    hashCode = (hashCode * 59) + this.Firstname.GetHashCode();
                }
                if (this.Gender != null)
                {
                    hashCode = (hashCode * 59) + this.Gender.GetHashCode();
                }
                if (this.Glasses != null)
                {
                    hashCode = (hashCode * 59) + this.Glasses.GetHashCode();
                }
                if (this.Height != null)
                {
                    hashCode = (hashCode * 59) + this.Height.GetHashCode();
                }
                if (this.IsDisability != null)
                {
                    hashCode = (hashCode * 59) + this.IsDisability.GetHashCode();
                }
                if (this.Lga != null)
                {
                    hashCode = (hashCode * 59) + this.Lga.GetHashCode();
                }
                if (this.MotherMaidenName != null)
                {
                    hashCode = (hashCode * 59) + this.MotherMaidenName.GetHashCode();
                }
                if (this.NinNumber != null)
                {
                    hashCode = (hashCode * 59) + this.NinNumber.GetHashCode();
                }
                if (this.Othername != null)
                {
                    hashCode = (hashCode * 59) + this.Othername.GetHashCode();
                }
                if (this.State != null)
                {
                    hashCode = (hashCode * 59) + this.State.GetHashCode();
                }
                if (this.Surname != null)
                {
                    hashCode = (hashCode * 59) + this.Surname.GetHashCode();
                }
                if (this.UniversaltaxIdentityNumber != null)
                {
                    hashCode = (hashCode * 59) + this.UniversaltaxIdentityNumber.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
